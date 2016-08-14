package lv.javaguru.java2.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class User {

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String login;
    private String password;




    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
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

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getLogin() {return login;}

    public void setLogin(String login) { this.login = login;}

    public String getPassword() {return password;}

    public void setPassword(String password) { this.password = password;}

    public String getFullName() {
        String fullName;
        String space = " ";
        firstName = getFirstName();
        lastName = getLastName();
        fullName  = firstName + space + lastName;
        return fullName;
    }

    // potom sdelatj hashirovanije passworda
    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
