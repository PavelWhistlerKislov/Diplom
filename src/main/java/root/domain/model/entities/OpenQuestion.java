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
    private String questionMessage;

    @Column(name = "right_answer", nullable = false)
    private String rightAnswer;

    @ManyToMany(mappedBy = "openQuestions")
    private Set<Test> tests;

    @OneToMany(mappedBy = "openQuestion")
    private Set<Answer> answers;


    public OpenQuestion(){
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

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public Set<Test> getTest() {
        return tests;
    }

    public void setTest(Set<Test> tests) {
        this.tests = tests;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }
}
