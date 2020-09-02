import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Columns;
import org.hibernate.query.criteria.internal.expression.function.LengthFunction;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(length = 2500)
    private String description;
    private String code;
    private String imageUrl;
    private boolean active;
    @OneToMany(mappedBy = "course")
    private List<Module> modules;
    @OneToMany (mappedBy = "course")
    private List<Person> person;

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", code='" + code + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", active=" + active +
                ", modules=" + modules +
                ", person=" + person +
                '}';
    }
}
