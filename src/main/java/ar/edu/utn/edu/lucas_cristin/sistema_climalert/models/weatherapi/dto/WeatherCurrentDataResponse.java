package ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.weatherapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherCurrentDataResponse(
        @JsonProperty("last_updated") String lastUpdated,
        @JsonProperty("temp_c") Double temperatureCelsius,
        @JsonProperty("feelslike_c") Double feelsLikeCelsius,
        @JsonProperty("wind_kph") Double windKph,
        @JsonProperty("precip_mm") Double precipitationMm,
        Integer humidity,
        WeatherConditionResponse condition
) {
}
