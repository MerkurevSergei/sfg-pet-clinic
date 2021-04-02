package ru.merkurev.sfgpetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * {@link Speciality} business entity.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.2
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Speciality extends BaseEntity {
  private String description;
}
