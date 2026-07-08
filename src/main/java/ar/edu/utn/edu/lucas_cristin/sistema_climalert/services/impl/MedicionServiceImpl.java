package ar.edu.utn.edu.lucas_cristin.sistema_climalert.services.impl;

import ar.edu.utn.edu.lucas_cristin.sistema_climalert.config.WeatherApiProperties;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.Alerta;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.Medicion;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.weatherapi.dto.WeatherCurrentResponse;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.repositories.interfaces.concretos.MedicionRepositorio;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.services.AlertaService;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.services.MedicionService;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.services.WeatherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicionServiceImpl implements MedicionService {
    private final WeatherService weatherService;
    private final AlertaService alertaService;
    private final WeatherApiProperties weatherApiProperties;
    private final MedicionRepositorio medicionRepositorio;
    private final EvaluadorAlerta evaluadorAlerta;

    public MedicionServiceImpl(WeatherService weatherService,
                               WeatherApiProperties weatherApiProperties,
                               MedicionRepositorio medicionRepositorio,
                               EvaluadorAlerta evaluadorAlerta,
                               AlertaService alertaService
    ) {
        this.weatherService = weatherService;
        this.weatherApiProperties = weatherApiProperties;
        this.medicionRepositorio = medicionRepositorio;
        this.evaluadorAlerta = evaluadorAlerta;
        this.alertaService = alertaService;

    }
    @Override
    public void verificarAlerta(Medicion medicion) {

        // Recupero la ultima alerta del repositorio
        List<Medicion> mediciones = medicionRepositorio.findAll();
        Medicion ultimaAlerta = mediciones.getLast();

        // Verifico si efectivamente es o no alerta
        if(!evaluadorAlerta.hayAlerta(ultimaAlerta) ){
            return;
        }else{
            Alerta alerta = new Alerta(
                    medicion.getFecha(),
                    medicion
            );
            alertaService.notificarAlerta(alerta);
            alertaService.guardarAlerta(alerta);
        }


    }

    @Override
    public void consultarMedicion() {

        // Obtengo el clima actual en modelo de dominio
        Medicion medicion = weatherService.obtenerClimaActual(weatherApiProperties.getCity());

        // Persisto la medicion
        medicionRepositorio.save(medicion);

    }

}
