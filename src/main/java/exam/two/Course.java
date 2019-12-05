package exam.two;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(name="dep", length = 2)
    private String department;
    private int number;
    @OneToMany(mappedBy = "course")
    private List<Enrollment> students;

    public Course() {
    }
}
