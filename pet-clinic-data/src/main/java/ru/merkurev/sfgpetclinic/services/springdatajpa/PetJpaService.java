package ru.merkurev.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import ru.merkurev.sfgpetclinic.model.Pet;
import ru.merkurev.sfgpetclinic.repositories.PetRepository;
import ru.merkurev.sfgpetclinic.services.PetService;

/**
 * PetJpaService based on AbstractJpaService and Spring Data JPA.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.2
 */
@Service
@Profile("springdatajpa")
public class PetJpaService extends AbstractJpaService<Pet, Long> implements PetService {
  public PetJpaService(PetRepository repository) {
    super(repository);
  }
}
