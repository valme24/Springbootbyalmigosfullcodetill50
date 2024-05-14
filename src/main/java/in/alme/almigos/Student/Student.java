package in.alme.almigos.Student;

import jakarta.persistence.*;

import java.util.Date;
//import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName="student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy =GenerationType.SEQUENCE,
            generator = "student_sequence"

    )
    private long id;
    private String name;
    private String email;
    private int age;
    private Date date ;


    /////////////////////////////////////constructure section ////////////////////

    public Student(long id, String name, String email, int age, Date date) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.date = date;
    }

    public Student() {
    }

    public Student(String name, String email, int age, Date date) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.date = date;
    }
    /////////////////////////////////////constructure section ////////////////////





    ///////////////////////////////////getters and setters  section  /////////////////////////////

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    ///////////////////////////////////getters and setters  section  /////////////////////////////


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
