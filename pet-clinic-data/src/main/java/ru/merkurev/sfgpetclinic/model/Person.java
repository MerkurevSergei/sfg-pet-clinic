package ru.merkurev.sfgpetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * {@link Person} business entity.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Person extends BaseEntity {
  private String firstName;
  private String lastName;
}
