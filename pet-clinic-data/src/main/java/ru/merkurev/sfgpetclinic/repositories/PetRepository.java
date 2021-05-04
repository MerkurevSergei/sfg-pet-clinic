package ru.merkurev.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import ru.merkurev.sfgpetclinic.model.Pet;

/**
 * Pet repository extends Spring CrudRepository.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.2
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
