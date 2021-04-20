package ru.merkurev.sfgpetclinic.model;

import java.util.Set;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * {@link Owner} business entity.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Owner extends Person {
  private String address;
  private String city;
  private String telephone;
  @ToString.Exclude
  Set<Pet> pets;
}
