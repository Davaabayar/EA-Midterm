package exam.one;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_id")
    private Long id;
    @Column(name="item_name")
    private String name;
    @Column(length = 4000)
    private String description;
    @Column(precision=19, scale=2)
    private BigDecimal initialPrice;
    @Column(precision=19, scale=2)
    private BigDecimal reservePrice;
    @Column(name="start_date")
    private LocalDateTime startDate;
    @Column(name="end_date")
    private LocalDateTime endDate;
    @Column(name="approval_datetime")
    private LocalDateTime approvalDate;
    private LocalDateTime created;
    @Version
    private int obj_version;

    //associations
    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();

    @OneToMany(mappedBy = "item")
    private List<Comment> comments = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="user_id")
    private User seller;

    public Item() {
    }

}
