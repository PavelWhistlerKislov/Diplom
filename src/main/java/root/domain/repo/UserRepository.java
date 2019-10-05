package root.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import root.domain.model.entities.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String>, QuerydslPredicateExecutor<User> {
    List<User> findByFirstNameStartsWithIgnoreCase(String firstName);
}
