package ru.merkurev.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;

import ru.merkurev.sfgpetclinic.model.Speciality;
import ru.merkurev.sfgpetclinic.services.SpecialtyService;

/**
 * SpecialityMapService implement AbstractMapService.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.2
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long>
    implements SpecialtyService {
}
