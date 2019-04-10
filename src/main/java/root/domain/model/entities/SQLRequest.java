package root.domain.model.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sql_questions")
public class SQLRequest {
    //TODO: РЕАЛИЗОВАТЬ

    @ManyToOne
    @JoinColumn(name="test_id")
    private Test test;
}
