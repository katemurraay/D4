package com.complex.manager;

import com.complex.dao.UserDAO;
import com.complex.entity.User;

public class UserManager {
    public User loginUser(String email, String passWord){

        UserDAO userDAO = new UserDAO();
        User user = userDAO.getUserByEmail(email);
        if(user==null){

            return null;

        }else{
            if (user.getPassword().equals(passWord)){
                return user;
            }
            else return null;
        }
    }
}
