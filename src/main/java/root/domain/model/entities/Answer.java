package root.domain.model.entities;

import root.domain.model.enums.AnswerType;

import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer {
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "id", nullable = false)
    private String answerMessage;

    @Column(name = "type", nullable = false)
    private AnswerType answerType;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User givenBy;

    @ManyToOne
    @JoinColumn(name="open_question_id")
    private OpenQuestion openQuestion;

    @ManyToOne
    @JoinColumn(name="closed_question_id")
    private ClosedQuestion closedQuestion;

    @ManyToOne
    @JoinColumn(name="sql_request_id")
    private SQLRequest sqlRequest;
}
