package root.domain.model.entities;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "open_questions")
public class OpenQuestion {
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "question_message", nullable = false)
    String questionMessage;

    @Column(name = "question_answer", nullable = false)
    String rightAnswer;

    @OneToMany(mappedBy = "answers")
    private Set<Answer> answers;

    @ManyToOne
    @JoinColumn(name="test_id", nullable = false)
    private Test test;

    public OpenQuestion(String questionMessage, String rightAnswer, Test test) {
        this.id = UUID.randomUUID().toString();
        this.questionMessage = questionMessage;
        this.rightAnswer = rightAnswer;
        this.test = test;
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

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
