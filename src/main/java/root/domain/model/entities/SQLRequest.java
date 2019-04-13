package root.domain.model.entities;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "sql_questions")
public class SQLRequest {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "question_message", nullable = false)
    private String questionMessage;

    @Column(name = "schemaName", nullable = false)
    private String schemaName;

    @OneToMany(mappedBy = "sqlQuestion")
    private Set<Answer> sqlQuestions;

    @ManyToOne
    @JoinColumn(name="test_id")
    private Test test;

    public SQLRequest(){
        this.id = UUID.randomUUID().toString();
    }

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

    public Set<Answer> getSqlQuestions() {
        return sqlQuestions;
    }

    public void setSqlQuestions(Set<Answer> sqlQuestions) {
        this.sqlQuestions = sqlQuestions;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
