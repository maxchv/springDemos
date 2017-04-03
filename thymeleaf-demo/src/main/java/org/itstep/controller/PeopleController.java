package org.itstep.controller;

import org.itstep.entity.Person;
import org.itstep.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PeopleController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/people")
    public String index(Model model) {
        model.addAttribute("people", personRepository.findAll());
        return "people/index";
    }

    @RequestMapping(value="/people/add", method = RequestMethod.GET)
    public String add() {
        return "people/add";
    }

    @RequestMapping(value="/people/add", method = RequestMethod.POST)
    public String save(@ModelAttribute Person person, RedirectAttributes redirectAttributes) {
        personRepository.save(person);
        redirectAttributes.addFlashAttribute("msg", "Saved successfully");
        return "redirect:/people";
    }

    @RequestMapping(value="/people/delete/{id}")
    public String delete(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        personRepository.delete(id);
        redirectAttributes.addFlashAttribute("msg", "Deleted successfully");
        return "redirect:/people";
    }
}
