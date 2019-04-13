package root.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import root.domain.model.entities.ClosedQuestion;
import root.domain.model.entities.OpenQuestion;

import java.util.List;

public interface ClosedQuestionRepository extends JpaRepository<ClosedQuestion, String>, QuerydslPredicateExecutor<ClosedQuestion> {
    List<OpenQuestion> findByQuestionMessageStartsWithIgnoreCase(String questionMessage);
}