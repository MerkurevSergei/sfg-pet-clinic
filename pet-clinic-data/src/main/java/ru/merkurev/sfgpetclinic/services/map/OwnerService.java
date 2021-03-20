package ru.merkurev.sfgpetclinic.services.map;

import ru.merkurev.sfgpetclinic.model.Owner;

/**
 * OwnerService implement AbstractMapService.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
public class OwnerService extends AbstractMapService<Owner, Long> {
  @Override
  public <S extends Owner> S save(S entity) {
    return super.save(entity.getId(), entity);
  }
}
