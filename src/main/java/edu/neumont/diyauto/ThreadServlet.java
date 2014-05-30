package edu.neumont.diyauto;

import edu.neumont.diyauto.Models.ModelAndView;
import edu.neumont.diyauto.diyautoControllers.ThreadGetController;
import edu.neumont.diyauto.diyautoControllers.ThreadPostController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jjensen on 5/28/14.
 */
@WebServlet("/thread")
public class ThreadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ModelAndView MAV = getURIParser(request, response);

        if(MAV.getModel()!= null)
        {
            request.setAttribute("Model", MAV.getModel());
        }
        RequestDispatcher view = request.getRequestDispatcher(MAV.getViewName());
        view.forward(request, response);

//        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/CreateThread.jsp");
//        view.forward(request, response);
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
    private static final Pattern P = Pattern.compile("(/threads)");
    private static final Pattern P2 = Pattern.compile("(/threads)(/create)");
    private static final Pattern P3 = Pattern.compile("(/thread/)([A-Za-z]+)");
    private static final Pattern P4 = Pattern.compile("(/thread/)([0-9]+)");

    public ModelAndView PostURIParser(HttpServletRequest request, HttpServletResponse response)
    {
        String URI = request.getRequestURI();
        ModelAndView MAV = null;
        Matcher match = this.P.matcher(URI);
        Matcher match2 = this.P2.matcher(URI);
        Matcher match3 = this.P3.matcher(URI);
        Matcher match4 = this.P4.matcher(URI);

        if(match2.find())
        {
            ThreadPostController tpc = new ThreadPostController(request, response);
            MAV = tpc.createThread();
        }


        return MAV;
    }
    public ModelAndView getURIParser(HttpServletRequest request, HttpServletResponse response)
    {
        String URI = request.getRequestURI();
        ModelAndView MAV = null;
        Matcher match = this.P.matcher(URI);
        Matcher match2 = this.P2.matcher(URI);
        Matcher match3 = this.P3.matcher(URI);
        Matcher match4 = this.P4.matcher(URI);

        if(match.find())
        {

        }
        else if(match2.find())
        {
            ThreadGetController threadGet = new ThreadGetController(request, response);
            MAV = threadGet.createThread();
        }
        else if(match4.find())
        {
            ThreadGetController threadGet = new ThreadGetController(request,response);
            int ID = Integer.parseInt(match4.group(2));
            MAV = threadGet.getThread(ID);
        }
        return MAV;
    }
}
