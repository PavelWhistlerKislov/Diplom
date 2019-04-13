package root.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import root.domain.model.entities.ClosedQuestionAnswerVariant;
import root.domain.model.entities.SQLRequest;

import java.util.List;


public interface ClosedQuestionAnswerVariantRepository extends JpaRepository<ClosedQuestionAnswerVariant, String>, QuerydslPredicateExecutor<ClosedQuestionAnswerVariant> {

}