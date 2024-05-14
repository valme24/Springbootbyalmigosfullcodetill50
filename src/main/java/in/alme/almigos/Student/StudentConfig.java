package in.alme.almigos.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student mariam = new Student("mariam" , "vansriam@gmail.com", 12, new Date("2023-03-04"));
            Student alex = new Student("alex" , "alexm@gmail.com", 12, new Date("2023-03-04"));
            repository.saveAll(List.of(mariam,alex));

        }
                ;
    }
}
