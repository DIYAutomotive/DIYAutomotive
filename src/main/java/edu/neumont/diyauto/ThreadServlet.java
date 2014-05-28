package edu.neumont.diyauto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jjensen on 5/28/14.
 */
@WebServlet("/thread")
public class ThreadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/CreateThread.jsp");
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        request.setAttribute("list", values);
//
//        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/GeneratedSolution.jsp");
//
//        view.forward(request, response);
    }
}
