package exam.one;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    @Column(name="category_id")
    private Long id;
    private LocalDateTime created;
    @Column(name="category_name")
    private String categoryName;
    @Version
    @Column(name ="obj_version")
    private int version=0;

    @ManyToMany
    @JoinTable(name="category_items",
            joinColumns ={@JoinColumn(name="category_ID")},
            inverseJoinColumns = {@JoinColumn(name="item_ID")})
    private List<Item> items = new ArrayList<>();

    public Category() {
    }
}
