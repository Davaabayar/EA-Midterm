package exam.two;

import javax.persistence.*;

@Entity
@Table(name="Grades")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 3)
    private String grade;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;

    public Enrollment() {
    }
}
