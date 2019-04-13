package root.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import root.domain.model.entities.Group;
import root.domain.model.entities.User;

import java.util.List;

    public interface GroupRepository extends JpaRepository<Group, String>, QuerydslPredicateExecutor<Group> {
        List<Group> findByNumberStartsWithIgnoreCase (String number);
    }

