package ar.edu.utn.edu.lucas_cristin.sistema_climalert.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "weather-api")
public class WeatherApiProperties {

    private String baseUrl;
    private String apiKey;
    private String city;
}
