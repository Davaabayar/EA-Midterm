package exam.one;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id=null;
    @Column(name="is_admin",length = 1)
    @Type(type="org.hibernate.type.BooleanType")
    private int isAdmin;
    private String email;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="`rank`")
    private int rank;
    @Version
    private int version;

    @OneToMany(mappedBy = "user")
    private List<Comment> commentList = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Address> addressList = new ArrayList<>();

    @OneToMany(mappedBy = "seller")
    private List<Item> itemList = new ArrayList<>();

    public User() {
    }
}
