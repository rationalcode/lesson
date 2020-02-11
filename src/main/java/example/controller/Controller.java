package example.controller;

import example.model.Student;
import example.StudentsService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    //@Autowired
    private StudentsService service;

    @RequestMapping("/")
    public String MainPage(Model model) {

        List<Student> list = service.listAll();

        model.addAttribute("studentsList", list);

        return "students";
    }


}
