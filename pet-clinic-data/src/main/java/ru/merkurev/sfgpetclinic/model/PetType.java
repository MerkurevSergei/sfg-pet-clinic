package ru.merkurev.sfgpetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * {@link PetType} business entity.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PetType extends BaseEntity {
  private String name;
}
