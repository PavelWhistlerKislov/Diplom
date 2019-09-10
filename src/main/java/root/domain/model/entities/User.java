package root.domain.model.entities;

import root.domain.model.enums.UserRole;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User{

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "role",nullable = false)
    private UserRole role;

    /*Звязи*/
    @ManyToOne
    @JoinColumn(name="group_id")
    private Group group;


    @OneToMany(mappedBy = "user")
    private Set<Answer> answers;

    @ManyToMany
    @JoinTable(
            name = "user_subject",
            joinColumns =  @JoinColumn(name = "user_id") ,
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private  Set<Subject> subjects = new HashSet<>();

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    public Set<Subject> getMentedSubjects() {
        return mentedSubjects;
    }

    public void setMentedSubjects(Set<Subject> mentedSubjects) {
        this.mentedSubjects = mentedSubjects;
    }

    @ManyToMany
    @JoinTable(
            name = "mentor_subject",
            joinColumns =  @JoinColumn(name = "mentor_id") ,
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private Set<Subject> mentedSubjects = new HashSet<>();

    @ManyToMany(mappedBy = "userTests")
    private Set<Test> tests;

    public User(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }
}
