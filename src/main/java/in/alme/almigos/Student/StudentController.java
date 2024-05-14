package in.alme.almigos.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/alme")
public class StudentController {

    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService =  studentService;
    }

    @GetMapping
    public List<Student> hello(){
        //return List.of("hello"," World!");
        return studentService.hello();
    }

}
