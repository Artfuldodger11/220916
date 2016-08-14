package lv.javaguru.java2.domain.builders;

import lv.javaguru.java2.domain.User;

public class UserBuilder {

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String login;
    private String password;


    private UserBuilder() { }

    public static UserBuilder createUser() {
        return new UserBuilder();
    }

    public User build() {

        User user = new User();
        user.setUserId(userId);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setLogin(login);
        user.setPassword(password);
        return user;
    }

    public UserBuilder withId(Long userId) {
        this.userId = userId;
        return this;
    }

    public UserBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withLogin (String login) {
        this.login = login;
        return this;
    }

    public UserBuilder withPssword (String Password) {
        this.password = password;
        return this;
    }

    public UserBuilder withEmail (String email) {
        this.email = email;
        return this;
    }

}