package root.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import root.domain.model.entities.OpenQuestion;
import root.domain.model.entities.Subject;

import java.util.List;


public interface OpenQuestionRepository extends JpaRepository<OpenQuestion, String>, QuerydslPredicateExecutor<OpenQuestion> {
    List<OpenQuestion> findByQuestionMessageStartsWithIgnoreCase(String questionMessage);
}