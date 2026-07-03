package ar.edu.utn.edu.lucas_cristin.sistema_climalert.services;

import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.Medicion;

public interface MedicionService{


    void verificarAlerta(Medicion medicion);

    void guardarMedicion(Medicion medicion);
}
