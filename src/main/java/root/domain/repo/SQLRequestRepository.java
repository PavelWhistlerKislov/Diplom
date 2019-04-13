package root.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import root.domain.model.entities.ClosedQuestion;
import root.domain.model.entities.OpenQuestion;
import root.domain.model.entities.SQLRequest;

import java.util.List;

public interface SQLRequestRepository extends JpaRepository<SQLRequest, String>, QuerydslPredicateExecutor<SQLRequest> {
    List<SQLRequest> findByQuestionMessageStartsWithIgnoreCase(String questionMessage);
}