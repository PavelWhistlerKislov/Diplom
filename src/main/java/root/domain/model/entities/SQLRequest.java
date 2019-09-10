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

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    @Column(name = "right_answer", nullable = false)
    private String rightAnswer;

    @Column(name = "schemaName", nullable = false)
    private String schemaName;

    @OneToMany(mappedBy = "sqlQuestion")
    private Set<Answer> sqlQuestions;

    @ManyToMany(mappedBy = "openQuestions")
    private Set<Test> tests;

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

    public Set<Test> getTests() {
        return tests;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }
}
