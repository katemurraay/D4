package com.complex.servlet;

import com.complex.entity.User;
import com.complex.manager.UserManager;
import com.complex.utils.IConstants;
import com.complex.utils.StringUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns ="/login" )
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (StringUtils.isStringEmpty(email) || StringUtils.isStringEmpty(password)) {

            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);

        }

        else {

            UserManager uMgr = new UserManager();
            User user = uMgr.loginUser(email, password);
            if (user == null) {
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                rd.forward(request, response);
            } else {
                request.getSession(true).setAttribute(IConstants.SESSION_KEY_USER, user);
                switch (user.getUserType()) {
                    case IConstants.USER_TYPE_ADMIN:
                    {
                        RequestDispatcher rd = request.getRequestDispatcher("/adminHome.jsp");
                        rd.forward(request, response);
                        break;
                    }
                    case IConstants.USER_TYPE_GENERAL_USER:
                    {
                        RequestDispatcher rd = request.getRequestDispatcher("ProductManagement?action=browse");
                        rd.forward(request, response);
                        break;
                    }
                    default:
                    {
                        RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
                        rd.forward(request, response);
                        break;
                    }
                }
            }
        }

    }

}
