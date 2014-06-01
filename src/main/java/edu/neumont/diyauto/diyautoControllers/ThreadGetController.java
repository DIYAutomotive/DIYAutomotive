package edu.neumont.diyauto.diyautoControllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.neumont.diyauto.ServiceLoader;
import edu.neumont.diyauto.Models.ModelAndView;
import edu.neumont.diyauto.Models.ThreadModel;
import edu.neumont.diyauto.Models.Threads;

public class ThreadGetController 
{
	HttpServletRequest request;
	HttpServletResponse response;
	Threads threads = ServiceLoader.threads;
	public ThreadGetController(HttpServletRequest request, HttpServletResponse response) 
	{
		this.request = request;
		this.response = response;
	}
	public ModelAndView createThread()
	{
		ModelAndView MAV = new ModelAndView(null, "/WEB-INF/views/threads/CreateThread.jsp");
		return MAV;
		
	}
	public ModelAndView getThread(int ID)
	{
		ThreadModel thread = threads.getThread(ID);
		ModelAndView MAV = new ModelAndView(thread, "/WEB-INF/views/threads/ThreadView.jsp");
		return MAV;
		
	}
	
	
}
