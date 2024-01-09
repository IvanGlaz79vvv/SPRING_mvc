package org.example.spring_mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class StudentController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/add_student")
    public String addStudent(Model model) {
        model.addAttribute("student", new Student());
        return "add_student";
    }
    @PostMapping("/add_student")
    public String greetingSubmit(@ModelAttribute Student student) {
        return "redirect:/";
    }
}