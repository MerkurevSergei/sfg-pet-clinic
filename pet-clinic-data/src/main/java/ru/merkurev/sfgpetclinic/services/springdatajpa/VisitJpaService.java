package ru.merkurev.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import ru.merkurev.sfgpetclinic.model.Visit;
import ru.merkurev.sfgpetclinic.repositories.VisitRepository;
import ru.merkurev.sfgpetclinic.services.VisitService;

/**
 * VisitJpaService based on AbstractJpaService and Spring Data JPA.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.2
 */
@Service
@Profile("springdatajpa")
public class VisitJpaService extends AbstractJpaService<Visit, Long> implements VisitService {
  public VisitJpaService(VisitRepository repository) {
    super(repository);
  }
}
