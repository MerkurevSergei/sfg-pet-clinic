package ru.merkurev.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ru.merkurev.sfgpetclinic.model.Owner;
import ru.merkurev.sfgpetclinic.model.Vet;
import ru.merkurev.sfgpetclinic.services.OwnerService;
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

  public DataLoader(OwnerService ownerService, VetService vetService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
  }

  @Override
  public void run(String... args) {

    Owner owner1 = new Owner();
    owner1.setId(1L);
    owner1.setFirstName("Ivan");
    owner1.setLastName("Ivanov");
    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setId(2L);
    owner2.setFirstName("Peter");
    owner2.setLastName("Petrov");
    ownerService.save(owner2);

    Vet vet1 = new Vet();
    vet1.setId(1L);
    vet1.setFirstName("Nika");
    vet1.setLastName("Nikola");
    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setId(2L);
    vet2.setFirstName("Lidia");
    vet2.setLastName("Amazing");
    vetService.save(vet2);

    System.out.println("Initial values loaded...");
  }
}
