package ru.merkurev.sfgpetclinic.services.map;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import ru.merkurev.sfgpetclinic.model.Owner;
import ru.merkurev.sfgpetclinic.model.Pet;
import ru.merkurev.sfgpetclinic.model.PetType;
import ru.merkurev.sfgpetclinic.services.OwnerService;
import ru.merkurev.sfgpetclinic.services.PetService;
import ru.merkurev.sfgpetclinic.services.PetTypeService;

/**
 * OwnerService implement AbstractMapService.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
@Service
@RequiredArgsConstructor
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
  private final PetTypeService petTypeService;
  private final PetService petService;

  @Override
  public <S extends Owner> S save(S entity) {
    S savedEntity = super.save(entity);
    saveRelatedEntities(savedEntity);
    return savedEntity;
  }

  private <S extends Owner> void saveRelatedEntities(S entity) {
    Set<Pet> pets = Optional.ofNullable(entity.getPets()).orElse(new HashSet<>());
    for (Pet pet : pets) {
      if (Objects.isNull(pet)) {
        continue;
      }
      PetType petType = Optional.ofNullable(pet.getPetType())
                                .orElseThrow(() -> new RuntimeException("Pet Type is required"));
      petService.save(pet);
      petTypeService.save(petType);
    }
  }
}
