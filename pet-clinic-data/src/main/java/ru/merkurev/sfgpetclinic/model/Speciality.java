package ru.merkurev.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

  @Column(name = "description")
  private String description;
}
