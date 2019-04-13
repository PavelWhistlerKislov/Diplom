package root.domain.model.entities;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "groups")
public class Group {


    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "group_number", nullable = false)
    private String number;

    @Column(name = " students_number")
    private Integer studentsNumder;

    @OneToMany(mappedBy = "users")
    private Set<User> students;

    public Group(String number){
        this.id = UUID.randomUUID().toString();
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Set<User> getStudents() {
        return students;
    }

    public void setStudents(Set<User> students) {
        this.students = students;
    }

    public Integer getStudentsNumder() {
        return studentsNumder;
    }

    public void setStudentsNumder(Integer studentsNumder) {
        this.studentsNumder = studentsNumder;
    }
}
