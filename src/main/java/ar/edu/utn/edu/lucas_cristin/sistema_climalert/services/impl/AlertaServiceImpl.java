package ar.edu.utn.edu.lucas_cristin.sistema_climalert.services.impl;

import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.Alerta;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.repositories.interfaces.concretos.AlertaRepositorio;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.services.AlertaService;
import org.springframework.stereotype.Service;

@Service
public class AlertaServiceImpl implements AlertaService {
    private final AlertaRepositorio alertaRepositorio;

    public AlertaServiceImpl(AlertaRepositorio alertaRepositorio) {
        this.alertaRepositorio = alertaRepositorio;
    }

    @Override
    public void notificarAlerta(Alerta alerta){
        // TODO mandar alerta
    }

    public void guardarAlerta(Alerta alerta){
        alertaRepositorio.save(alerta);
    }
}
