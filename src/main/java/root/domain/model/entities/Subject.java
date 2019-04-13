package root.domain.model.entities;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "subject_name", nullable = false)
    private String subjectName;

    @ManyToMany(mappedBy = "learnedSubjects")
    private Set<User> students;

    @OneToMany(cascade=ALL, mappedBy = "modules")
    private Set<Module> modules;

    public Subject(String subjectName){
        this.id = UUID.randomUUID().toString();
        this.subjectName = subjectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Set<User> getStudents() {
        return students;
    }

    public void setStudents(Set<User> students) {
        this.students = students;
    }

    public Set<Module> getModules() {
        return modules;
    }

    public void setModules(Set<Module> modules) {
        this.modules = modules;
    }
}
