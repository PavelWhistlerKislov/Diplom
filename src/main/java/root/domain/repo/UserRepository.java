package root.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import root.domain.model.User;

public interface UserRepository extends CrudRepository<User, Long>,
        QuerydslPredicateExecutor<User> {
}
