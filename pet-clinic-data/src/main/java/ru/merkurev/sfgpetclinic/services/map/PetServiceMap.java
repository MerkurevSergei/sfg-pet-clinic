package ru.merkurev.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import ru.merkurev.sfgpetclinic.model.Pet;
import ru.merkurev.sfgpetclinic.services.PetService;

/**
 * PetService implement AbstractMapService.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
  @Override
  public <S extends Pet> S save(S entity) {
    return super.save(entity.getId(), entity);
  }
}
