package root.domain.model.entities;

import javax.persistence.*;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "tests")
public class Test {
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @ManyToOne
    @JoinColumn(name="module_id")
    private Module module;

    @OneToMany(mappedBy = "open_questions")
    private Set<OpenQuestion> openQuestions;

    @OneToMany(mappedBy = "closed_questions")
    private Set<ClosedQuestion> closedQuestions;

    @OneToMany(mappedBy = "sql_questions")
    private Set<SQLRequest> sqlRequests;

    //TODO:QUESTIONS
}
