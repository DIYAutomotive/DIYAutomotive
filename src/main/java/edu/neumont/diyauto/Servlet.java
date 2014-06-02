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
	DbContext context = ServiceLoader.context;
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String input = request.getParameter("input");
		ArrayList<Result> values = new ArrayList<Result>();
		
		for(String key : context.getMapKeys()){
			if(input.toLowerCase().contains(key.toLowerCase())){
				values.addAll(context.getAllResults(key));
			}
		}
		
		if(values.isEmpty()){
			values.add(new Result("Nothing", "It appears we don't have any feedback for the given input."));
		}
		
		request.setAttribute("list", values);
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/GeneratedSolution.jsp");
        view.forward(request, response);
	}

}