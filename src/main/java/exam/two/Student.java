package exam.two;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="studentId")
    private Long id;
    private String name;
    private int age;

    @OneToMany
    private List<Enrollment> Courses;

    public Student() {
    }
}
