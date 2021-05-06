package ru.merkurev.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import ru.merkurev.sfgpetclinic.model.PetType;
import ru.merkurev.sfgpetclinic.repositories.PetTypeRepository;
import ru.merkurev.sfgpetclinic.services.PetTypeService;

/**
 * PetTypeJpaService based on AbstractJpaService and Spring Data JPA.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.2
 */
@Service
@Profile("springdatajpa")
public class PetTypeJpaService extends AbstractJpaService<PetType, Long> implements PetTypeService {
  public PetTypeJpaService(PetTypeRepository repository) {
    super(repository);
  }
}
