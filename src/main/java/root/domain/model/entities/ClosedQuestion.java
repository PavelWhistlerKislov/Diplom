package root.domain.model.entities;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "closed_questions")
public class ClosedQuestion {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "question_message", nullable = false)
    private String questionMessage;

    @OneToMany(mappedBy = "closed_question_answer_variants")
    private Set<ClosedQuestionAnswerVariant> closedQuestionAnswerVariants;

    @ManyToOne
    @JoinColumn(name="test_id", nullable = false)
    private Test test;

    @OneToMany(mappedBy = "answers")
    private Set<Answer> answers;

    public ClosedQuestion(String questionMessage, Test test){
        this.id = UUID.randomUUID().toString();
        this.test = test;
    }

    public Set<ClosedQuestionAnswerVariant> getClosedQuestionAnswerVariants() {
        return closedQuestionAnswerVariants;
    }

    public void setClosedQuestionAnswerVariants(Set<ClosedQuestionAnswerVariant> closedQuestionAnswerVariants) {
        this.closedQuestionAnswerVariants = closedQuestionAnswerVariants;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
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
