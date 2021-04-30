package ru.merkurev.sfgpetclinic.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * {@link Visit} business entity.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.2
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {
  
  @Column(name = "date")
  private LocalDate date;
  
  @Column(name = "description")
  private String description;
  
  @ManyToOne
  @JoinColumn(name = "pet_id")
  private Pet pet;

}
