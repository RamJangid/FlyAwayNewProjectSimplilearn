package main.java.servlets;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
    public static boolean isLoggedIn = false;
    public static String password = "Admin";
    public static String email = "admin@flyaway.com";

    @Override
    public void doPost (HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();

        String email = req.getParameter("emailEntered");
        String pass = req.getParameter("passwordEntered");

        if (email.equals(Login.email) && pass.equals(Login.password)){
            isLoggedIn = true;
            out.println("You have LoggedIn Successfully!!!");
            resp.sendRedirect("admin-dashboard.jsp");
        }
        else {
            isLoggedIn = false;
            out.println("Login Failed : Incorrect email or Password, Please enter correct login credentials");
        }
        out.close();
    }
}
