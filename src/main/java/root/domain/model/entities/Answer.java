package root.domain.model.entities;

import root.domain.model.enums.AnswerType;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "answers")
public class Answer {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "answer_message", nullable = false)
    private String answerMessage;

    @ManyToOne
    @JoinColumn(name="open_question_id")
    private OpenQuestion openQuestion;

    @ManyToOne
    @JoinColumn(name="closed_question_id")
    private ClosedQuestion closedQuestion;

    @ManyToOne
    @JoinColumn(name="sql_question_id")
    private SQLRequest sqlQuestion;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    @Column(name = "answer_type", nullable = false)
    private AnswerType answerType;

    @Column(name = "answer_status", nullable = false)
    private Boolean answerStatus;
    private Boolean getAnswerStatus() {
        return answerStatus;
    }

    public void setAnswerStatus(Boolean answerStatus) {
        this.answerStatus = answerStatus;
    }

    public Answer(){
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

    public OpenQuestion getOpenQuestion() {
        return openQuestion;
    }

    public void setOpenQuestion(OpenQuestion openQuestion) {
        this.openQuestion = openQuestion;
    }

    public ClosedQuestion getClosedQuestion() {
        return closedQuestion;
    }

    public void setClosedQuestion(ClosedQuestion closedQuestion) {
        this.closedQuestion = closedQuestion;
    }

    public SQLRequest getSqlQuestion() {
        return sqlQuestion;
    }

    public void setSqlQuestion(SQLRequest sqlQuestion) {
        this.sqlQuestion = sqlQuestion;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AnswerType getAnswerType() {
        return answerType;
    }

    public void setAnswerType(AnswerType answerType) {
        this.answerType = answerType;
    }
}
