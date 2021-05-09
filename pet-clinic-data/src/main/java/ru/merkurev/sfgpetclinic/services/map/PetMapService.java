package ru.merkurev.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
}
 