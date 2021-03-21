package ru.merkurev.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.merkurev.sfgpetclinic.services.OwnerService;

/**
 * Owner Controller.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
@Controller
@RequestMapping("owners")
public class OwnerController {

  private final OwnerService ownerService;

  public OwnerController(OwnerService ownerService) {
    this.ownerService = ownerService;
  }

  @RequestMapping({ "", "/", "index", "index.html" })
  public String list(Model model) {
    model.addAttribute("owners", ownerService.findAll());
    return "owners/index";
  }
}
