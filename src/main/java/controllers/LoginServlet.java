package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import javabeans.NguoiDung;
import models.NguoiDungBL;

import java.io.IOException;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
   
   @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email, password;
        
        email = req.getParameter("email");
        password = req.getParameter("password");
        
        NguoiDung nd = NguoiDungBL.docTheoEmailPassword(email, password);
        
        HttpSession session = req.getSession();
        session.setAttribute("nd", nd);
//        System.out.println("login"+ email + password);
        
        resp.sendRedirect("index.jsp");
        
    }

}
