package ru.merkurev.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Index Application Controller.
 *
 * @author Merkurev Sergei
 * @version 0.1
 * @since 0.1
 */
@Controller
public class IndexController {

  @RequestMapping({ "", "/", "index", "index.html" })
  public String index() {
    return "index";
  }
}
