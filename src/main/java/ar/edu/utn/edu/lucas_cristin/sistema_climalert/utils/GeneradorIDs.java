package ar.edu.utn.edu.lucas_cristin.sistema_climalert.utils;

public class GeneradorIDs {
    private long siguiente;

    public GeneradorIDs() {
        this(1L);
    }

    public GeneradorIDs(long valorInicial) {
        this.siguiente = valorInicial;
    }

    public long siguiente() {
        return siguiente++;
    }
}
