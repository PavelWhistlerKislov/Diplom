package root.domain.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tests")
public class Test {
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    //TODO:QUESTIONS
}
