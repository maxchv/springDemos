package org.itstep.controller;

import org.itstep.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("msg", "Hello Spring Boot");
        return "index";
    }


}
