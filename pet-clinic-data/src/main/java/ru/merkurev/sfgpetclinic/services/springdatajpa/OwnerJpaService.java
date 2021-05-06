package ru.merkurev.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import ru.merkurev.sfgpetclinic.model.Owner;
import ru.merkurev.sfgpetclinic.repositories.OwnerRepository;
import ru.merkurev.sfgpetclinic.services.OwnerService;

/**
 * OwnerService based on AbstractJpaService and Spring Data JPA.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.2
 */
@Service
@Profile("springdatajpa")
public class OwnerJpaService extends AbstractJpaService<Owner, Long> implements OwnerService {
  public OwnerJpaService(OwnerRepository repository) {
    super(repository);
  }
}
