package ar.edu.utn.edu.lucas_cristin.sistema_climalert.services;

import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.Alerta;

public interface AlertaService {

    public void notificarAlerta(Alerta alerta);

    void guardarAlerta(Alerta alerta);
}
