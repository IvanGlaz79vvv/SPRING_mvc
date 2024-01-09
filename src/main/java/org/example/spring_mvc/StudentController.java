package org.example.spring_mvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//Изменим класс контроллера. После получения результатов заполнения формы, данные будут сохраняться в базе данных.
@Controller
public class StudentController {
    private StudentService service;

    @Autowired
    public void setService(StudentService service) {
        this.service = service;
    }

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
        service.saveStudent(student);
        return "redirect:/";
    }
}