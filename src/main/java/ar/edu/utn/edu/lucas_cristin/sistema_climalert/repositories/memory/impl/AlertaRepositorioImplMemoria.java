package ar.edu.utn.edu.lucas_cristin.sistema_climalert.repositories.memory.impl;

import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.Alerta;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.Medicion;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.repositories.interfaces.concretos.MedicionRepositorio;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.repositories.memory.RepositorioGenericoMemoria;
import org.springframework.stereotype.Repository;

@Repository
public class AlertaRepositorioImplMemoria extends RepositorioGenericoMemoria<Alerta> implements MedicionRepositorio {

    @Override
    protected Long getID(Alerta alerta){
        return alerta.getId();
    }

    @Override
    protected void setID(Alerta alerta, Long id){
        alerta.setId(id);
    }

}
