package ar.edu.utn.edu.lucas_cristin.sistema_climalert.services;

import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.weatherapi.dto.WeatherCurrentResponse;

public interface WeatherService {

    WeatherCurrentResponse obtenerClimaActual(String ubicacion);
}
