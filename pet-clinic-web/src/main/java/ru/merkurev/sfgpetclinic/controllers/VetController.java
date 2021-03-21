package ru.merkurev.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.merkurev.sfgpetclinic.services.VetService;

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

  private final VetService vetService;

  public VetController(VetService vetService) {
    this.vetService = vetService;
  }

  @RequestMapping({ "", "/", "index", "index.html" })
  public String list(Model model) {
    model.addAttribute("vets", vetService.findAll());
    return "vets/index";
  }
}
