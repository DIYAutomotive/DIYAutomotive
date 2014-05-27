package edu.neumont.diyauto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.neumont.diyauto.Models.ModelAndView;

@WebServlet("/test")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModelAndView MAV = getURIParser(request, response);
		
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
	private static final Pattern P = Pattern.compile("(/threads)");
	private static final Pattern P2 = Pattern.compile("(/threads)(/create)");
	private static final Pattern P3 = Pattern.compile("(/thread/)([A-Za-z]+)");
	
	public ModelAndView getURIParser(HttpServletRequest request, HttpServletResponse response)
	{
		String URI = request.getRequestURI();
		ModelAndView MAV = null;
		Matcher match = this.P.matcher(URI);
		Matcher match2 = this.P2.matcher(URI);
		Matcher match3 = this.P3.matcher(URI);
		
		if(match.find())
		{
			
		}
		else if(match2.find())
		{
			
		}
		else if(match3.find())
		{
			
		}
		return MAV;
		
	
	
	}

	private void logic(String problem, ArrayList<String> values) {
		problem.toLowerCase();
		
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
		
//		boolean isEmpty = false;
//		for(int i = 0; i < values.size(); i++){
//			isEmpty = values.get(i) == null;
//		}
//		
//		if(isEmpty)
//			values.add("empty");
//		else
//			values.add(null);
		
	}

}