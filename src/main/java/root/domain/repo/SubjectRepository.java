package root.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import root.domain.model.entities.Subject;
import root.domain.model.entities.User;

import java.util.List;


public interface SubjectRepository extends JpaRepository<Subject, String>, QuerydslPredicateExecutor<Subject> {
    List<Subject> findBySubjectNameStartsWithIgnoreCase(String subjectName);
}
