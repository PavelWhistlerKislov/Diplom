package root.domain.model;

import root.domain.model.enums.UserRole;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User{

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gruop")
    private String group;

    @Column(name = "course")
    private String course;

    @Column(name = "role")
    private UserRole role;

    public User(){
        this.id = UUID.randomUUID().toString();
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public UserRole getRole() {
       return role;
   }

    public void setRole(UserRole role) {
       this.role = role;
    }
}
