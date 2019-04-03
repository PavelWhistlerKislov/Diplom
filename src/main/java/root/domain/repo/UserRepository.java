package root.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import root.domain.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String>, QuerydslPredicateExecutor<User> {
    List<User> findByLastNameStartsWithIgnoreCase(String lastName);
}
