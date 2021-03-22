package ru.merkurev.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import ru.merkurev.sfgpetclinic.model.BaseEntity;
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
public abstract class AbstractMapService<T extends BaseEntity, IDT extends Long>
    implements CrudService<T, IDT> {

  protected Map<Long, T> map = new HashMap<>();

  @Override
  public <S extends T> S save(S entity) {
    entity = Optional.ofNullable(entity)
                     .orElseThrow(() -> new IllegalArgumentException("Entity cannot be null"));
    Long nextId = map.keySet().stream().mapToLong(v -> v).max().orElse(0) + 1;
    entity.setId(nextId);
    map.put(nextId, entity);
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
