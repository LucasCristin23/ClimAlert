package ar.edu.utn.edu.lucas_cristin.sistema_climalert.services.impl;

import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.Medicion;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.ReglaAlerta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EvaluadorAlerta {

    private final List<ReglaAlerta> reglaAlertas;

    public EvaluadorAlerta(List<ReglaAlerta> reglaAlertas) {
        this.reglaAlertas = reglaAlertas;
    }

    public boolean hayAlerta(Medicion medicion){
        return reglaAlertas.stream().anyMatch(reglaAlerta -> reglaAlerta.verificarAlerta(medicion));
    }

}
