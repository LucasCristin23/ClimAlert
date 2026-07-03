package ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.weatherapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherLocationResponse(
        String name,
        String region,
        String country,
        @JsonProperty("localtime") String localTime
) {
}
