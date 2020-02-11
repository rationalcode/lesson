package example;

import example.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    private StudentsRepository repository;

    public StudentsService(StudentsRepository repository) {
        this.repository = repository;
    }

    public List<Student> listAll(){

        return repository.findAll();

    }
}
