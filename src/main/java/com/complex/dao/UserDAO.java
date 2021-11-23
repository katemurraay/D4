package com.complex.dao;

import com.complex.entity.User;
import com.complex.utils.IConstants;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAO {
    Logger logger;
    public User getUserByEmail(String email) {
    if (email.equals("admin@admin.com")){
        User user1 = new User(1,"admin@admin.com","admin","Mary", "Murphy",IConstants.USER_TYPE_ADMIN);
        return user1;
    }

    User user2 = new User(1,"user@user.com","user","Terry", "Jones", IConstants.USER_TYPE_GENERAL_USER);
        return user2;


    }

    public Vector<User> getAllUsers() {


        Vector<User> userData = new Vector();
        User user1 = new User(1,"admin@admin.com","admin","Mary", "Murphy",IConstants.USER_TYPE_ADMIN);
        userData.add(user1);
        User user2 = new User(1,"user@user.com","admin","Terry", "Jones",IConstants.USER_TYPE_GENERAL_USER);
        userData.add(user2);
        return userData;

    }


}
