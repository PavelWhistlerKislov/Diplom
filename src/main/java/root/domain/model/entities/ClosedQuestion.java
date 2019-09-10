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

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private Set<ClosedQuestionAnswerVariant> questionAnswers;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "right_answer_id", referencedColumnName = "id")
    private ClosedQuestionAnswerVariant rightAnswer;

    @OneToMany(mappedBy = "closedQuestion")
    private Set<Answer> answers;

    private Set<Test> getTests() {
        return tests;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }

    @ManyToMany(mappedBy = "openQuestions")
    private Set<Test> tests;

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

    public Set<ClosedQuestionAnswerVariant> getQuestionAnswers() {
        return questionAnswers;
    }

    public void setQuestionAnswers(Set<ClosedQuestionAnswerVariant> questionAnswers) {
        this.questionAnswers = questionAnswers;
    }

    public ClosedQuestionAnswerVariant getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(ClosedQuestionAnswerVariant rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public Set<Answer> getGiwenAnswers() {
        return answers;
    }

    public void setGiwenAnswers(Set<Answer> giwenAnswers) {
        this.answers = giwenAnswers;
    }

    public Set<Answer> getGivenAnswers() {
        return answers;
    }

    public void setGivenAnswers(Set<Answer> givenAnswers) {
        this.answers = givenAnswers;
    }

}
