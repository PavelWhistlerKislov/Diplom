package root.domain.model;

import org.springframework.lang.NonNull;
import root.domain.model.enums.QuestionType;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue
    @Column(name = "id")
    @NonNull
    private String Id;

    @Column(name = "question_message")
    private String questionMessage;

    @Column(name = "question_type")
    private QuestionType type;

    @Column(name = "test_id")
    private String testId;

    public Question(){
        this.Id = UUID.randomUUID().toString();
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getQuestionMessage() {
        return questionMessage;
    }

    public void setQuestionMessage(String questionMessage) {
        this.questionMessage = questionMessage;
    }

    public QuestionType getType() {
        return type;
    }

    public void setType(QuestionType type) {
        this.type = type;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }
}
