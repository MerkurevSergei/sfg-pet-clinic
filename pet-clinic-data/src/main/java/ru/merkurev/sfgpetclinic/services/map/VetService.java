package ru.merkurev.sfgpetclinic.services.map;

import ru.merkurev.sfgpetclinic.model.Vet;

/**
 * VetService implement AbstractMapService.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
public class VetService extends AbstractMapService<Vet, Long> {
  @Override
  public <S extends Vet> S save(S entity) {
    return super.save(entity.getId(), entity);
  }
}
