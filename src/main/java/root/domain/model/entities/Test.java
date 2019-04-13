package root.domain.model.entities;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

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

    public Test(Module module){
        this.id = UUID.randomUUID().toString();
        this.module = module;
    }

    public Test() {
        this.id = UUID.randomUUID().toString();
    }

    @OneToMany(mappedBy = "open_questions")
    private Set<OpenQuestion> openQuestions;

    @OneToMany(mappedBy = "closed_questions")
    private Set<ClosedQuestion> closedQuestions;

    @OneToMany(mappedBy = "sql_questions")
    private Set<SQLRequest> sqlRequests;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Set<OpenQuestion> getOpenQuestions() {
        return openQuestions;
    }

    public void setOpenQuestions(Set<OpenQuestion> openQuestions) {
        this.openQuestions = openQuestions;
    }

    public Set<ClosedQuestion> getClosedQuestions() {
        return closedQuestions;
    }

    public void setClosedQuestions(Set<ClosedQuestion> closedQuestions) {
        this.closedQuestions = closedQuestions;
    }

    public Set<SQLRequest> getSqlRequests() {
        return sqlRequests;
    }

    public void setSqlRequests(Set<SQLRequest> sqlRequests) {
        this.sqlRequests = sqlRequests;
    }
}
