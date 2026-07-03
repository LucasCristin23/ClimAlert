package ar.edu.utn.edu.lucas_cristin.sistema_climalert.repositories.memory.impl;

import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.Medicion;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.repositories.interfaces.concretos.MedicionRepositorio;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.repositories.memory.RepositorioGenericoMemoria;
import org.springframework.stereotype.Repository;

@Repository
public class MedicionRepositorioImplMemoria extends RepositorioGenericoMemoria<Medicion> implements MedicionRepositorio {

    @Override
    protected Long getID(Medicion medicion){
        return medicion.getId();
    }

    @Override
    protected void setID(Medicion medicion, Long id){
        medicion.setId(id);
    }

}
