package root.domain.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "groups")
public class Group {


    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "group_number", nullable = false)
    private String number;

    //TODO:STUDENTS

}
