package exam.one;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @Column(name="comment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String content;

    @ManyToOne
    @JoinTable(name="comment_item", joinColumns = {@JoinColumn(name="comment")},inverseJoinColumns = {@JoinColumn(name="item")})
    private Item item;

    @ManyToOne
    private User user;
}
