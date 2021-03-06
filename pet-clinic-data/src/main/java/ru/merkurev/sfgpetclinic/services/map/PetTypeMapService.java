package ru.merkurev.sfgpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import ru.merkurev.sfgpetclinic.model.PetType;
import ru.merkurev.sfgpetclinic.services.PetTypeService;

/**
 * PetTypeMapService implement AbstractMapService.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.2
 */
@Service
@Profile({"default", "mapdata"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

}
