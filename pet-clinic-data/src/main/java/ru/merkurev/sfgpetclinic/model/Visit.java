package ru.merkurev.sfgpetclinic.model;

import java.time.LocalDate;

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
public class Visit extends BaseEntity {
  LocalDate date;
  String description;

}
