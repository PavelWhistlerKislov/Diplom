package root.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import root.domain.model.entities.Module;
import root.domain.model.entities.Subject;

import java.util.List;


public interface ModuleRepository extends JpaRepository<Module, String>, QuerydslPredicateExecutor<Module> {
    List<Module> findBySubject(Subject subject);
}
