package ru.merkurev.sfgpetclinic.services.map;

import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import ru.merkurev.sfgpetclinic.model.Visit;
import ru.merkurev.sfgpetclinic.services.VisitService;

/**
 * VisitMapService implement AbstractMapService.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.2
 */
@Service
@RequiredArgsConstructor
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

  private final PetMapService petMapService;

  @Override
  public <S extends Visit> S save(S entity) {
    Optional.ofNullable(entity).orElseThrow(() -> new RuntimeException("Visit cannot be null"));
    petMapService.save(entity.getPet());
    return super.save(entity);
  }
}
