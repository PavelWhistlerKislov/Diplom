package root.domain.model.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "closed_questions")
public class ClosedQuestion {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "question_message", nullable = false)
    private String questionMessage;

    //TODO: Доделать

    @ManyToOne
    @JoinColumn(name="test_id")
    private Test test;

    public ClosedQuestion(){
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

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
