package root.domain.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modules")
public class Module {
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "module_number", nullable = false)
    private String number;

    //TODO: TESTS
}
