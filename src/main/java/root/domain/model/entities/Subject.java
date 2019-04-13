package root.domain.model.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "subject_name", nullable = false)
    private String subjectName;

    @OneToMany(mappedBy = "subject")
    private Set<Module> modules;

    @ManyToMany(mappedBy = "subjects")
    private Set<User> students = new HashSet<>();

    public Subject(){ this.id = UUID.randomUUID().toString();}

    public Subject(String subjectName ){
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

    public Set<Module> getModules() {
        return modules;
    }

    public void setModules(Set<Module> modules) {
        this.modules = modules;
    }

    public Set<User> getStudents() {
        return students;
    }

    public void setStudents(Set<User> students) {
        this.students = students;
    }
}
