package root.domain.model.entities;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "modules")
public class Module {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "module_number", nullable = false)
    private Integer number;

    @Column(name = "module_name")
    private String name;

    @ManyToOne
    @JoinColumn(name="subject_id")
    private Subject subject;

    @OneToMany(mappedBy = "module")
    private Set<Test> tests;

    public Module(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Set<Test> getTests() {
        return tests;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
