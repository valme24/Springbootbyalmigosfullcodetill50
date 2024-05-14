package in.alme.almigos.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class StudentService {


    private final StudentRepository studentRepository ;
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }





    public List<Student> hello(){
        return studentRepository.findAll();

    }
}
