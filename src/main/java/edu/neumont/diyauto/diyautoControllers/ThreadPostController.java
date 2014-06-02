package edu.neumont.diyauto.diyautoControllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.neumont.diyauto.ServiceLoader;
import edu.neumont.diyauto.Models.ModelAndView;
import edu.neumont.diyauto.Models.ThreadModel;
import edu.neumont.diyauto.Models.Threads;

public class ThreadPostController {
	HttpServletRequest request;
	HttpServletResponse response;
	Threads threads = ServiceLoader.threads;
	public ThreadPostController(HttpServletRequest request, HttpServletResponse response) 
	{
		this.request = request;
		this.response = response;
	}

	public ModelAndView createThread()
	{
		int ID = ServiceLoader.threadID++;
		String Name = request.getParameter("title").toString();
		ThreadModel thread = new ThreadModel(ID, Name);

        if(request.getParameter("description").toString() != null)
		{
			thread.setDescription(request.getParameter("description").toString());
		}

        threads.AddThread(thread);

		ModelAndView MAV = new ModelAndView(thread, "/threads/" + ID);
		return MAV;
		
	}
	public ModelAndView getThread(int ID)
	{
		ThreadModel thread = threads.getThread(ID);
		ModelAndView MAV = new ModelAndView(thread, "/WEB-INF/ThreadView/" + ID + ".jsp");
		return MAV;
		
	}
}
