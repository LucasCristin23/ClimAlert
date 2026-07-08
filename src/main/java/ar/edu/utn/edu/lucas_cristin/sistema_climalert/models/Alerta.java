package ar.edu.utn.edu.lucas_cristin.sistema_climalert.models;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Data
public class Alerta {
    private Long Id;
    private LocalDateTime fecha;
    private Medicion medicionDisparadora;
    private List<ReglaAlerta> indicadoresAlerta;

    public Alerta(LocalDateTime fecha, Medicion medicionDisparadora) {
        this.fecha = fecha;
        this.medicionDisparadora = medicionDisparadora;
    }

    public Boolean VerificarAlerta(Medicion medicion){
        return this.indicadoresAlerta.stream()
                .anyMatch(alerta -> alerta.verificarAlerta(medicion));
    }
}
