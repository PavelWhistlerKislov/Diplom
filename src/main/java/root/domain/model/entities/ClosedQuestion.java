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

    @OneToOne(mappedBy = "ForRightAnswer" )
    private ClosedQuestionAnswerVariant rightAnswer;

    @OneToMany(mappedBy = "closedQuestion")
    private Set<Answer> givenAnswers;

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
        return givenAnswers;
    }

    public void setGiwenAnswers(Set<Answer> giwenAnswers) {
        this.givenAnswers = giwenAnswers;
    }

    public Set<Answer> getGivenAnswers() {
        return givenAnswers;
    }

    public void setGivenAnswers(Set<Answer> givenAnswers) {
        this.givenAnswers = givenAnswers;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
