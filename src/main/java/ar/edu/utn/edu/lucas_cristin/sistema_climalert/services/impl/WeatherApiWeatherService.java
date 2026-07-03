package ar.edu.utn.edu.lucas_cristin.sistema_climalert.services.impl;

import ar.edu.utn.edu.lucas_cristin.sistema_climalert.config.WeatherApiProperties;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.services.WeatherService;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.weatherapi.dto.WeatherCurrentResponse;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;

@Service
public class WeatherApiWeatherService implements WeatherService {

    private final RestClient weatherApiRestClient;
    private final WeatherApiProperties properties;

    public WeatherApiWeatherService(RestClient weatherApiRestClient, WeatherApiProperties properties) {
        this.weatherApiRestClient = weatherApiRestClient;
        this.properties = properties;
    }

    @Override
    public WeatherCurrentResponse obtenerClimaActual(String ubicacion) {
        if (!StringUtils.hasText(ubicacion)) {
            throw new IllegalArgumentException("La ubicacion es obligatoria");
        }

        if (!StringUtils.hasText(properties.getApiKey())) {
            throw new IllegalStateException("La API key de WeatherAPI no esta configurada");
        }

        return weatherApiRestClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/current.json")
                        .queryParam("key", properties.getApiKey())
                        .queryParam("q", ubicacion)
                        .queryParam("aqi", "no")
                        .build())
                .retrieve()
                .body(WeatherCurrentResponse.class);
    }
}
