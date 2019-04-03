package root.domain.repo;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import root.domain.model.Question;
import root.domain.model.User;

import java.util.List;

public interface QuestionRepo extends CrudRepository<Question, Long>, QuerydslPredicateExecutor<User> {
    List<User> findByLastNameStartsWithIgnoreCase(String lastName);
}