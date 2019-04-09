package root.domain.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "subject_name", nullable = false)
    private String subjectName;

    //TODO: ПОЛЕ MODULES
}
