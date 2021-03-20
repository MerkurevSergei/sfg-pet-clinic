package ru.merkurev.sfgpetclinic.services.map;

import ru.merkurev.sfgpetclinic.model.Pet;

/**
 * PetService implement AbstractMapService.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
public class PetService extends AbstractMapService<Pet, Long> {
  @Override
  public <S extends Pet> S save(S entity) {
    return super.save(entity.getId(), entity);
  }
}
