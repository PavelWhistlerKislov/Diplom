package root.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import root.domain.model.entities.Module;
import root.domain.model.entities.Subject;
import root.domain.model.entities.Test;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, String>, QuerydslPredicateExecutor<Test> {
    List<Test> findByModule(Module module);
}