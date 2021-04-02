package ru.merkurev.sfgpetclinic.model;

import java.util.Set;

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
public class Vet extends Person {
  private Set<Speciality> specialities;
}
