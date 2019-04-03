package root.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import root.domain.model.Question;


import java.util.List;

public interface QuestionRepo extends JpaRepository<Question, String>, QuerydslPredicateExecutor<Question> {
}