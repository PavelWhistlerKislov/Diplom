package root.domain.model.entities;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tests")
public class Test {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @ManyToOne
    @JoinColumn(name="module_id")
    private Module module;


    @ManyToMany
    @JoinTable(
            name = "test_open_questions",
            joinColumns =  @JoinColumn(name = "test_id") ,
            inverseJoinColumns = @JoinColumn(name = "open_question_id")
    )
    private Set<OpenQuestion> openQuestions;

    @ManyToMany
    @JoinTable(
            name = "test_closed_questions",
            joinColumns =  @JoinColumn(name = "test_id") ,
            inverseJoinColumns = @JoinColumn(name = "closed_question_id")
    )
    private Set<ClosedQuestion> closedQuestions;

    @ManyToMany
    @JoinTable(
            name = "test_sql_questions",
            joinColumns =  @JoinColumn(name = "test_id") ,
            inverseJoinColumns = @JoinColumn(name = "sql_question_id")
    )
    private Set<SQLRequest> sqlRequests;

    @ManyToMany
    @JoinTable(
            name = "user_tests",
            joinColumns =  @JoinColumn(name = "user_id") ,
            inverseJoinColumns = @JoinColumn(name = "test_id")
    )
    private Set<User> userTests;

    public Test(){
        this.id = UUID.randomUUID().toString();
    }

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
