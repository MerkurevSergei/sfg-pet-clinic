package ru.merkurev.sfgpetclinic.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Pet
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Pet extends BaseEntity {
  private PetType petType;
  private Owner owner;
  private LocalDate birthDate;
}
