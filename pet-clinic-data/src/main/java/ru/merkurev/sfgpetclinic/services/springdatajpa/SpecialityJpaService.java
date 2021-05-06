package ru.merkurev.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import ru.merkurev.sfgpetclinic.model.Speciality;
import ru.merkurev.sfgpetclinic.repositories.SpecialityRepository;
import ru.merkurev.sfgpetclinic.services.SpecialityService;

/**
 * SpecialityJpaService based on AbstractJpaService and Spring Data JPA.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.2
 */
@Service
@Profile("springdatajpa")
public class SpecialityJpaService extends AbstractJpaService<Speciality, Long> implements
    SpecialityService {
  public SpecialityJpaService(SpecialityRepository repository) {
    super(repository);
  }
}
