package lv.javaguru.java2.servlet.AccessCheck;


import lv.javaguru.java2.database.DBException;
import lv.javaguru.java2.database.UserDAO;
import lv.javaguru.java2.database.hibernate.UserDAOImpl;
import lv.javaguru.java2.domain.User;

public class AccessLevel {

   private static int BANNED = 0;
   private static int USER = 1;
   private static int MODERATOR = 2;
   private static int  ADMIN = 3;


   private UserDAO userDAO;
   private User user;

    public AccessLevel( UserDAO userDAO,User user) {
        this.userDAO = userDAO;
        this.user = user;
    }

    public int setAccessLevel(String userLogin) {

          int accessLevel = user.setAccessLevel(USER);
            // dopisatj dlja admina i moderatora
        return accessLevel;
    }
}
