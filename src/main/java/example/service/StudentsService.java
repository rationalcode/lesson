package example.service;

import example.model.Student;
import example.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    public StudentsRepository getRepository() {
        return repository;
    }

    public void setRepository(StudentsRepository repository) {
        this.repository = repository;
    }

    private StudentsRepository repository;

    @Autowired
    public StudentsService(@Qualifier("studentsRepository") StudentsRepository repository) {
        this.repository = repository;
    }

    public List<Student> listAll(){

        return repository.findAll();

    }
}
