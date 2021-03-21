package ru.merkurev.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

  @RequestMapping({ "", "/", "index", "index.html" })
  public String list() {
    return "owners/index";
  }
}
