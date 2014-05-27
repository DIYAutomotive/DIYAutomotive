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
		String prob1 = request.getParameter("problem1");
		String prob2 = request.getParameter("problem2");
		String prob3 = request.getParameter("problem3");
		String prob4 = request.getParameter("problem4");
		String prob5 = request.getParameter("problem5");
		
		ArrayList<String> values = new ArrayList<String>();
		values.add(prob1);
		values.add(prob2);
		values.add(prob3);
		values.add(prob4);
		values.add(prob5);
		
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

}