package ar.edu.utn.edu.lucas_cristin.sistema_climalert.models;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class Medicion {

    private Long Id;
    private String ciudad;
    private LocalDateTime fecha;
    private Double temperatura;
    private Integer humedad;

    public Medicion(String ciudad, LocalDateTime fecha, Double temperatura, Integer humedad) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

}
