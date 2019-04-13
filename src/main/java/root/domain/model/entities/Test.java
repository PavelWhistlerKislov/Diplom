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

    @OneToMany(mappedBy = "test")
    private Set<OpenQuestion> openQuestions;

    @OneToMany(mappedBy = "test")
    private Set<ClosedQuestion> closedQuestions;

    @OneToMany(mappedBy = "test")
    private Set<SQLRequest> sqlRequests;

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
