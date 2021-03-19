package ru.merkurev.sfgpetclinic.services;

import java.util.Optional;

/**
 * Interface for generic CRUD operations for a specific type.
 *
 * @author Merkurev Sergei
 * @version 0.2
 * @since 0.2
 */
public interface CrudService<T, IDT> {

  /**
   * Saves a given entity. Use the returned instance for further operations
   * as the save operation might have changed the entity instance completely.
   *
   * @param entity
   *     must not be {@literal null}.
   * @return the saved entity; will never be {@literal null}.
   * @throws IllegalArgumentException
   *     in case the given {@literal entity} is {@literal null}.
   */
  <S extends T> S save(S entity);

  /**
   * Retrieves an entity by its id.
   *
   * @param id
   *     must not be {@literal null}.
   * @return the entity with the given id or {@literal Optional#empty()} if none found.
   * @throws IllegalArgumentException
   *     if {@literal id} is {@literal null}.
   */
  Optional<T> findById(IDT id);

  /**
   * Returns all instances of the type.
   *
   * @return all entities
   */
  Iterable<T> findAll();

  /**
   * Deletes the entity with the given id.
   *
   * @param id
   *     must not be {@literal null}.
   * @throws IllegalArgumentException
   *     in case the given {@literal id} is {@literal null}
   */
  void deleteById(IDT id);

  /**
   * Deletes a given entity.
   *
   * @param entity
   *     must not be {@literal null}.
   * @throws IllegalArgumentException
   *     in case the given entity is {@literal null}.
   */
  void delete(T entity);
}
