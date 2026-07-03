package ar.edu.utn.edu.lucas_cristin.sistema_climalert.repositories.interfaces;

import java.util.List;

public interface RepositorioGenerico<T> {
    List<T> findAll();
    List<T> findByID(List<Long> ids);
    T findByID(Long id);
    T save(T entidad);
    void delete(Long id);
}
