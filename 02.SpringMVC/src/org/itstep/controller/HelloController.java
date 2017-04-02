package org.itstep.controller;

import org.itstep.controller.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping("/add-student")
    public String addStudent(Model model, @ModelAttribute Student student) {
        model.addAttribute("student", student);
        return "student-info";
    }
}
