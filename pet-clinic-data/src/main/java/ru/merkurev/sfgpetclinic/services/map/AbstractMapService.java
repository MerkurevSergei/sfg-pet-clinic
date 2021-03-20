package ru.merkurev.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import ru.merkurev.sfgpetclinic.services.CrudService;

/**
 * Base Crud implementations.
 *
 * @param <T>
 *     business entity type
 * @param <IDT>
 *     identifier
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
public abstract class AbstractMapService<T, IDT extends Number> implements CrudService<T, IDT> {

  protected Map<IDT, T> map = new HashMap<>();

  protected <S extends T> S save(IDT id, S entity) {
    map.put(id, entity);
    return entity;
  }

  @Override
  public Optional<T> findById(IDT id) {
    return Optional.ofNullable(map.get(id));
  }

  @Override
  public Iterable<T> findAll() {
    return map.values();
  }

  @Override
  public void deleteById(IDT id) {
    map.remove(id);
  }

  @Override
  public void delete(T entity) {
    map.entrySet().removeIf(entry -> entry.getValue().equals(entity));
  }
}
