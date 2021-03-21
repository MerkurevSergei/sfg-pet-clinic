package ru.merkurev.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Vet Controller.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
@Controller
@RequestMapping("vets")
public class VetController {

  @RequestMapping({ "", "/", "index", "index.html" })
  public String list() {
    return "vets/index";
  }
}
