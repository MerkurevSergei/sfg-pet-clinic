package ru.merkurev.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

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
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
  @Override
  public <S extends Vet> S save(S entity) {
    return super.save(entity.getId(), entity);
  }
}
