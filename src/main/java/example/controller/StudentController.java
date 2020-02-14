package example.controller;

import example.model.Student;
import example.service.StudentsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class StudentController {

    public StudentsService getStudentsService() {
        return studentsService;
    }

    public void setStudentsService(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    private StudentsService studentsService;

    public StudentController(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @GetMapping
    public String MainPage(Model model) {
        List<Student> list = studentsService.listAll();
        model.addAttribute("studentsList", list);
        return "students";
    }


}
