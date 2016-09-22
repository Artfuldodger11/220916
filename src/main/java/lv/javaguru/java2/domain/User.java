package lv.javaguru.java2.domain;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class User {



    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name="id", columnDefinition = "int")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long userId;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "accessLevel")
    private int accessLevel;


    @Override
    public boolean equals(Object object) {
        if (object==null) return false;
        if (!(object instanceof User)) return false;
        if (((User) object).getUserId()==this.userId) return true;
        else return false;

    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public int setAccessLevel(int accessLevel) {this.accessLevel = accessLevel;
        return accessLevel;
    }

    public int getAccessLevel () {return accessLevel;}

    public void setUserId(Long userId) {
        this.userId = userId;
    }


}