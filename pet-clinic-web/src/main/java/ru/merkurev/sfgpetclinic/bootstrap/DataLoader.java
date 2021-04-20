package ru.merkurev.sfgpetclinic.bootstrap;

import java.time.LocalDate;
import java.util.Collections;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ru.merkurev.sfgpetclinic.model.Owner;
import ru.merkurev.sfgpetclinic.model.Pet;
import ru.merkurev.sfgpetclinic.model.PetType;
import ru.merkurev.sfgpetclinic.model.Vet;
import ru.merkurev.sfgpetclinic.services.OwnerService;
import ru.merkurev.sfgpetclinic.services.PetTypeService;
import ru.merkurev.sfgpetclinic.services.VetService;

/**
 * Loads the initial values to the storage.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;
  private final PetTypeService petTypeService;

  /**
   * DataLoader constructor.
   *
   * @param ownerService
   *     service
   * @param vetService
   *     service
   * @param petTypeService
   *     service
   */
  public DataLoader(OwnerService ownerService, VetService vetService,
      PetTypeService petTypeService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
    this.petTypeService = petTypeService;
  }

  @Override
  public void run(String... args) {

    PetType petTypeDog = new PetType();
    petTypeDog.setName("Dog");
    petTypeService.save(petTypeDog);

    PetType petTypeCat = new PetType();
    petTypeCat.setName("Cat");
    petTypeService.save(petTypeCat);
    
    Owner owner1 = new Owner();
    owner1.setFirstName("Ivan");
    owner1.setLastName("Ivanov");
    owner1.setAddress("Gagarin's 12");
    owner1.setCity("Moscow");
    owner1.setTelephone("+7(123)151-21-32");

    Pet pet1 = new Pet();
    pet1.setPetType(petTypeDog);
    pet1.setOwner(owner1);
    pet1.setBirthDate(LocalDate.now());
    pet1.setName("Ivanov's pet");
    owner1.setPets(Collections.singleton(pet1));
    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setFirstName("Peter");
    owner2.setLastName("Petrov");
    owner2.setAddress("Lenin 24");
    owner2.setCity("Nerungri");
    owner2.setTelephone("+7(124)152-22-33");
    ownerService.save(owner2);

    Vet vet1 = new Vet();
    vet1.setFirstName("Nika");
    vet1.setLastName("Nikola");
    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setFirstName("Lidia");
    vet2.setLastName("Amazing");
    vetService.save(vet2);

    System.out.println("Initial values loaded...");
  }
}
