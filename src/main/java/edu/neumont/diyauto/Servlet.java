package edu.neumont.diyauto;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String problem = request.getParameter("input");
		
		ArrayList<String> values = new ArrayList<String>();
		logic(problem, values);
		
		request.setAttribute("list", values);
		
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/GeneratedSolution.jsp");
		view.forward(request, response);
	}

	private void logic(String problem, ArrayList<String> values) {
		if(problem.contains("brake") || problem.contains("shak"))
			values.add("brake");
		else
			values.add(null);
		if(problem.contains("idling") || problem.contains("die") || problem.contains("leak"))
			values.add("idling");
		else
			values.add(null);
		if(problem.contains("start") || problem.contains("battery"))
			values.add("start");
		else
			values.add(null);
		if(problem.contains("steering") || problem.contains("squealing") || problem.contains("screech"))
			values.add("steering");
		else
			values.add(null);
		if(problem.contains("clutch") || problem.contains("slipping") || problem.contains("gear") || problem.contains("grinding"))
			values.add("clutch");
		else
			values.add(null);
		
	}

}