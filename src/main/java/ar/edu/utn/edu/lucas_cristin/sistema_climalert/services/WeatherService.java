package ar.edu.utn.edu.lucas_cristin.sistema_climalert.services;

import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.Medicion;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.weatherapi.dto.WeatherCurrentResponse;

public interface WeatherService {

    WeatherCurrentResponse obtenerMedicion(String ubicacion);
    Medicion obtenerClimaActual(String ubicacion);

}
