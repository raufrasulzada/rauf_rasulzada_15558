package az.edu.ada.wm2.firstspringapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import az.edu.ada.wm2.firstspringapp.model.Person;

@Controller
@RequestMapping("/persons")
public class PersonController {

  @Autowired
  private Person defaultPerson;

  @GetMapping()
  public String listPersons(Model model) {
    System.out.println(defaultPerson);
    model.addAttribute("persons", List.of(
      new Person("Ali", "Aliyev"),
      new Person("Gulnara", "Azizova"),
      new Person("Murad", "Ibrahimli"),
      new Person("Laman", "Khudatzada")
    ));
    return "person_list";
  }
}
