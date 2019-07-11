package controller;

import factories.UserServiceFactory;
import model.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/register")
public class UserRegistrationServlet extends HttpServlet {
    private final UserService userService = UserServiceFactory.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String repeatPassword = req.getParameter("repeatPassword");

        if (email.isEmpty() || password.isEmpty() || repeatPassword.isEmpty()) {
            req.setAttribute("isValid", "All fields could not be empty");
            req.setAttribute("checkEmail", email);
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } else {
            if (password.equals(repeatPassword)) {
                User user = new User(email,password);
                userService.add(user);
                resp.sendRedirect("index.jsp");
            } else {
                req.setAttribute("checkEmail", email);
                req.setAttribute("isValid", "The password is not valid, try again.");
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            }
        }
    }
}
