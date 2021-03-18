package ru.merkurev.sfgpetclinic.model;

import lombok.Data;

/**
 * Base entity for some entities.
 * Contains {@code id} properties as Long.
 *
 * @author Merkurev Sergei (merkurevsergei@yandex.ru)
 * @version 0.1
 * @since 0.1
 */
@Data
public class BaseEntity {
  private Long id;
}
