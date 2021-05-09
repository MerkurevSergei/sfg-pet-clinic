package ru.merkurev.sfgpetclinic.bootstrap;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ru.merkurev.sfgpetclinic.model.Owner;
import ru.merkurev.sfgpetclinic.model.Pet;
import ru.merkurev.sfgpetclinic.model.PetType;
import ru.merkurev.sfgpetclinic.model.Speciality;
import ru.merkurev.sfgpetclinic.model.Vet;
import ru.merkurev.sfgpetclinic.model.Visit;
import ru.merkurev.sfgpetclinic.services.OwnerService;
import ru.merkurev.sfgpetclinic.services.PetTypeService;
import ru.merkurev.sfgpetclinic.services.VetService;
import ru.merkurev.sfgpetclinic.services.VisitService;
import ru.merkurev.sfgpetclinic.services.map.SpecialityMapService;

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
  private final SpecialityMapService specialityMapService;
  private final VisitService visitService;
  

  /**
   * DataLoader constructor.
   *
   * @param ownerService
   *     service
   * @param vetService
   *     service
   * @param petTypeService
   *     service
   * @param specialityMapService
   *     service
   * @param visitService
   *     service
   */
  public DataLoader(OwnerService ownerService, VetService vetService,
      PetTypeService petTypeService,
      SpecialityMapService specialityMapService,
      VisitService visitService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
    this.petTypeService = petTypeService;
    this.specialityMapService = specialityMapService;
    this.visitService = visitService;
  }

  @Override
  public void run(String... args) {
    loadData();
  }

  private void loadData() {
    PetType petTypeDog = new PetType();
    petTypeDog.setName("Dog");
    petTypeService.save(petTypeDog);

    PetType petTypeCat = new PetType();
    petTypeCat.setName("Cat");
    petTypeService.save(petTypeCat);

    Speciality radiology = new Speciality();
    radiology.setDescription("Radiology");
    Speciality surgery = new Speciality();
    surgery.setDescription("Surgery");
    Speciality dentistry = new Speciality();
    dentistry.setDescription("Dentistry");
    specialityMapService.save(radiology);
    specialityMapService.save(surgery);
    specialityMapService.save(dentistry);

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

    Visit petVisit = new Visit();
    petVisit.setPet(pet1);
    petVisit.setDate(LocalDate.now());
    petVisit.setDescription("Sneezy Kitty");
    
    visitService.save(petVisit);
    
    Vet vet1 = new Vet();
    vet1.setFirstName("Nika");
    vet1.setLastName("Nikola");
    vet1.setSpecialities(Set.of(radiology));
    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setFirstName("Lidia");
    vet2.setLastName("Amazing");
    vet2.setSpecialities(Set.of(surgery));
    vetService.save(vet2);

    System.out.println("Initial values loaded...");
  }
}
