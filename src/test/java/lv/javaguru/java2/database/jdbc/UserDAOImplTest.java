package lv.javaguru.java2.database.jdbc;

import lv.javaguru.java2.config.SpringConfig;
import lv.javaguru.java2.database.DBException;
import lv.javaguru.java2.database.UserDAO;
import lv.javaguru.java2.database.hibernate.*;
import lv.javaguru.java2.database.hibernate.UserDAOImpl;
import lv.javaguru.java2.domain.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)

public class UserDAOImplTest {

    //@Autowired private SessionFactory sessionFactory;

    @Autowired
    @Qualifier ("ORM_UserDAO")
    private UserDAO userDAOz;

    @Before
    // napisatj


    @Test
        public void testCreate() throws DBException {
            User user = TestMethods.createUser("firstName", "lastName", "email", "login", "password", 0L, 1);
            userDAOz.create(user);
            User userFromDB = userDAOz.getById(user.getUserId());
            assertNotNull(userFromDB);
            assertEquals(user.getUserId(), userFromDB.getUserId());
            assertEquals(user.getFirstName(), userFromDB.getFirstName());
            assertEquals(user.getLastName(), userFromDB.getLastName());
    }

    }


