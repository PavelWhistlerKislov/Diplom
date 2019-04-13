package root.domain.model.entities;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "sql_requests")
public class SQLRequest {
    //TODO: РЕАЛИЗОВАТЬ

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "question_message", nullable = false)
    private String questionMessage;

    @Column(name = "schema_name", nullable = false)
    private String schemaName;

    @ManyToOne
    @JoinColumn(name="test_id")
    private Test test;

    public SQLRequest( String questionMessage, String schemaName, Test test) {
        this.id = UUID.randomUUID().toString();
        this.questionMessage = questionMessage;
        this.schemaName = schemaName;
        this.test = test;
    }

    @OneToMany(mappedBy = "answers")
    private Set<Answer> answers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionMessage() {
        return questionMessage;
    }

    public void setQuestionMessage(String questionMessage) {
        this.questionMessage = questionMessage;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }
}
