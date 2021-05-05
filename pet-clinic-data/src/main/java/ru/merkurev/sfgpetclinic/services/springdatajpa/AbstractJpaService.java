package ru.merkurev.sfgpetclinic.services.springdatajpa;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import lombok.RequiredArgsConstructor;
import ru.merkurev.sfgpetclinic.services.CrudService;

/**
 * Base Crud implementations for JPA based on Spring Data JPA.
 *
 * @param <T>
 *     business entity type
 * @param <IDT>
 *     identifier
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.2
 */
@RequiredArgsConstructor
public class AbstractJpaService<T, IDT> implements CrudService<T, IDT> {

  private final CrudRepository<T, IDT> repository;

  @Override
  public <S extends T> S save(S entity) {
    return repository.save(entity);
  }

  @Override
  public Optional<T> findById(IDT id) {
    return repository.findById(id);
  }

  @Override
  public Iterable<T> findAll() {
    return repository.findAll();
  }

  @Override
  public void deleteById(IDT id) {
    repository.deleteById(id);
  }

  @Override
  public void delete(T entity) {
    repository.delete(entity);
  }
}
