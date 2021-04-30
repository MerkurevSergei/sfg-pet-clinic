package ru.merkurev.sfgpetclinic.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

  @Column(name = "name")
  private String name;

  @OneToOne
  private PetType petType;

  @ManyToOne
  @JoinColumn(name = "owner_id")
  private Owner owner;

  @Column(name = "birth_date")
  private LocalDate birthDate;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
  private Set<Visit> visits = new HashSet<>();
}
