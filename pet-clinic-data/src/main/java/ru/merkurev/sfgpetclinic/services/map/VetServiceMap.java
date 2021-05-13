package ru.merkurev.sfgpetclinic.services.map;

import java.util.Optional;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import ru.merkurev.sfgpetclinic.model.Speciality;
import ru.merkurev.sfgpetclinic.model.Vet;
import ru.merkurev.sfgpetclinic.services.VetService;

/**
 * VetService implement AbstractMapService.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
@Service
@RequiredArgsConstructor
@Profile({"default", "mapdata"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
  private final SpecialityMapService specialityMapService;

  @Override
  public <S extends Vet> S save(S entity) {
    entity = Optional.ofNullable(entity)
                     .orElseThrow(() -> new RuntimeException("Vet cannot be null"));
    Set<Speciality> specialities = Optional.ofNullable(entity.getSpecialities()).orElse(Set.of());
    specialities.forEach(specialityMapService::save);
    return super.save(entity);
  }
}
