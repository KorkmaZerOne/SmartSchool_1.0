package be.intecbrussel.Model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @Column(unique = true , nullable = false )
    private String login;
    private String passwordHash;
    private boolean active;
    @OneToOne //unidirectional relations
    private Person person;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", active=" + active +
                ", person=" + person +
                '}';
    }
}
