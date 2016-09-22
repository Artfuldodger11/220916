package lv.javaguru.java2.database.jdbc;

import lv.javaguru.java2.database.hibernate.*;
import lv.javaguru.java2.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;



public class TestMethods {

    @Autowired
    lv.javaguru.java2.database.hibernate.UserDAOImpl User;

    public static User createUser(String firstName, String lastName, String email,
                           String login, String password, Long id, int accessLevel) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setLogin(login);
        user.setPassword(password);
        user.setAccessLevel(accessLevel);
        return user;
    }

    public static List<String> getTableNames() {
        List<String> tableNames = new ArrayList<String>();
        tableNames.add("users");
        // add more tables if needed
        return tableNames;
    }
}
