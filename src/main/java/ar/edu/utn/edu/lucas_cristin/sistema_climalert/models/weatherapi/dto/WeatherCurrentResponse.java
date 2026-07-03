package ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.weatherapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherCurrentResponse(
        WeatherLocationResponse location,
        WeatherCurrentDataResponse current
) {
}
