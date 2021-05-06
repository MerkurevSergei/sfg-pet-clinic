package ru.merkurev.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import ru.merkurev.sfgpetclinic.model.Vet;
import ru.merkurev.sfgpetclinic.repositories.VetRepository;
import ru.merkurev.sfgpetclinic.services.VetService;

/**
 * VetJpaService based on AbstractJpaService and Spring Data JPA.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.2
 */
@Service
@Profile("springdatajpa")
public class VetJpaService extends AbstractJpaService<Vet, Long> implements VetService {
  public VetJpaService(VetRepository repository) {
    super(repository);
  }
}
