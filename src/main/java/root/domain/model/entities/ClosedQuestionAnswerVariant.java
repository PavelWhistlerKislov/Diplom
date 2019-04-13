package root.domain.model.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "closed_question_answer_variants")
public class ClosedQuestionAnswerVariant {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "answer_message", nullable = false)
    private String answerMessage;

    @ManyToOne
    @JoinColumn(name="closed_question_id", nullable = false)
    private ClosedQuestion question;

    @OneToOne
    @MapsId
    private ClosedQuestion  ForRightAnswer;

    public ClosedQuestionAnswerVariant(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnswerMessage() {
        return answerMessage;
    }

    public void setAnswerMessage(String answerMessage) {
        this.answerMessage = answerMessage;
    }

    public ClosedQuestion getQuestion() {
        return question;
    }

    public void setQuestion(ClosedQuestion question) {
        this.question = question;
    }

    public ClosedQuestion getForRightAnswer() {
        return ForRightAnswer;
    }

    public void setForRigthAnswer(ClosedQuestion forRightAnswer) {
        ForRightAnswer = forRightAnswer;
    }
}
