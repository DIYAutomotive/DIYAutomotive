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
import edu.neumont.diyauto.diyautoControllers.ThreadGetController;
import edu.neumont.diyauto.diyautoControllers.ThreadPostController;
import edu.neumont.diyauto.Models.ModelAndView;

@WebServlet("/test/*")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Pattern P = Pattern.compile("(/threads)");
	private static final Pattern P2 = Pattern.compile("(/threads)(/create)");
	private static final Pattern P3 = Pattern.compile("(/thread/)([A-Za-z]+)");
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
		
//		See if any of the user input matches a keyword in the hashmap then get solutions from keyword
		for(String s : context.getMapKeys()){
			if(input.contains(s)){
//				System.out.println("found keyword");
				values.addAll(context.getAllResults(input));
			}
		}
		
//		System.out.println("list of results:" + values.toString());
		
		request.setAttribute("list", values);
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/GeneratedSolution.jsp");
        view.forward(request, response);
	}


}