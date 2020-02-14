package example.repository;

import example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository <Student, Long> {
}
