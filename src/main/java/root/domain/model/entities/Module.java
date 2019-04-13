package root.domain.model.entities;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "modules")
public class Module {
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "module_number", nullable = false)
    private String number;

    @ManyToOne
    @JoinColumn(name="subject_id", nullable=false)
    private Subject subject;

    @OneToMany(mappedBy = "tests")
    private Set<Test> tests;

    public Module(String number, Subject subject){
        this.id = UUID.randomUUID().toString();
        this.number = number;
        this.subject = subject;
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
}
