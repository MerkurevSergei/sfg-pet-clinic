package ru.merkurev.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import ru.merkurev.sfgpetclinic.model.Owner;

/**
 * Owner repository extends from Spring CrudRepository.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.2
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
