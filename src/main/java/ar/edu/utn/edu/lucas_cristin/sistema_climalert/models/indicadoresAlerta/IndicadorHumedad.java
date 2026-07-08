package ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.indicadoresAlerta;

import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.Medicion;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.models.ReglaAlerta;
import org.springframework.stereotype.Component;

@Component
public class IndicadorHumedad implements ReglaAlerta {

    @Override
    public Boolean verificarAlerta(Medicion medicion) {
        return true;
    }
}
