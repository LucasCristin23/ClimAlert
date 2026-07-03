package ar.edu.utn.edu.lucas_cristin.sistema_climalert.repositories.memory;

import ar.edu.utn.edu.lucas_cristin.sistema_climalert.repositories.interfaces.RepositorioGenerico;
import ar.edu.utn.edu.lucas_cristin.sistema_climalert.utils.GeneradorIDs;

import java.util.ArrayList;
import java.util.List;

public abstract class RepositorioGenericoMemoria<T> implements RepositorioGenerico<T> {

    private final GeneradorIDs generadorId = new GeneradorIDs();

    protected List<T> entidades = new ArrayList<>();

    protected abstract Long getID(T entidad);

    protected abstract void setID(T entidad, Long id);

    @Override
    public List<T> findAll() {
        return new ArrayList<>(entidades);
    }

    @Override
    public T findByID(Long id) {
        return entidades.stream().filter(entidad -> this.getID(entidad).equals(id)).findFirst().orElseThrow(() -> new ResourceNotFoundException("No se encontró el ID " + id + " en el repositorio"));
    }

    @Override
    public List<T> findByID(List<Long> ids) {
        List<T> entidadesEncontradas = new ArrayList<>();
        if(ids == null || ids.isEmpty()) return entidadesEncontradas;
        ids.forEach(id -> {
            T entidad = findByID(id);
            entidadesEncontradas.add(entidad);
        });
        return entidadesEncontradas;
    }

    @Override
    public T save(T entidad) {
        if(getID(entidad) == null) {
            setID(entidad, generadorId.siguiente());
            entidades.add(entidad);
            return entidad;
        }
        delete(getID(entidad));
        entidades.add(entidad);
        return entidad;
    }

    @Override
    public void delete(Long id) {
        T entidad = findByID(id);
        entidades.remove(entidad);
    }

}
