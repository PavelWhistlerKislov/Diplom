package root.domain.model.entities;

import javax.persistence.*;
import java.util.Set;

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

    //TODO: TESTS
}
