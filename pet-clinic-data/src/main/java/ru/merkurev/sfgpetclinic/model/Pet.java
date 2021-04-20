package ru.merkurev.sfgpetclinic.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * {@link Pet} business entity.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Pet extends BaseEntity {
  private String name;
  private PetType petType;
  private Owner owner;
  private LocalDate birthDate;
}
