package root.domain.model.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "closed_question_answer_variants")
public class ClosedQuestionAnswerVariant {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "answer_message", nullable = false)
    private String answerMessage;

    @ManyToOne
    @JoinColumn(name="closed_question_id")
    private ClosedQuestion closedQuestion;


}
