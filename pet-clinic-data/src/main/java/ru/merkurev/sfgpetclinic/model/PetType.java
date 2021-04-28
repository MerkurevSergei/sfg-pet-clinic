package ru.merkurev.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;

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
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@Entity
public class PetType extends BaseEntity {
  
  @Column(name = "name")
  private String name;
}
