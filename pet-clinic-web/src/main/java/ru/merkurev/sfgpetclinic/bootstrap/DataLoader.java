package ru.merkurev.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ru.merkurev.sfgpetclinic.model.Owner;
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
    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setFirstName("Peter");
    owner2.setLastName("Petrov");
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
