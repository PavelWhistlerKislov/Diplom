package root.domain.model.entities;

import javax.persistence.*;
import java.util.Set;

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
}
