import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserClassHibernate {

    @Id
    private long id;
    private String name;

    public UserClassHibernate() {
    }

    public UserClassHibernate(long l, String name) {
        this.id = l;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}