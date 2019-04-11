package root.domain.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "open_questions")
public class OpenQuestion {
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "question_message", nullable = false)
    String questionMessage;

    @Column(name = "question_answer")
    String questionAnswer;

    @Column(name = "given_answer")
    String givenAnswer;

    @ManyToOne
    @JoinColumn(name="test_id")
    private Test test;
}
