package edu.neumont.diyauto.diyautoControllers;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.neumont.diyauto.Framework.ModelAndView;
import edu.neumont.diyauto.Models.ThreadsModel;
import edu.neumont.diyauto.ServiceLoader;
import edu.neumont.diyauto.Services.ThreadsService;

@Stateless
@LocalBean
public class ThreadPostController {
	HttpServletRequest request;
	HttpServletResponse response;
    @Inject ThreadsService threadService;
	public ThreadPostController(HttpServletRequest request, HttpServletResponse response)
	{
		this.request = request;
		this.response = response;
	}

	public ModelAndView createThread()
	{
        ThreadsModel thread = new ThreadsModel();
        String Name = request.getParameter("title").toString();
        thread.setName(Name);
        if(request.getParameter("description").toString() != null)
		{
			thread.setDescription(request.getParameter("description").toString());
		}
        threadService.updateThread(thread);
		ModelAndView MAV = new ModelAndView(thread, "/threads/" + thread.getIdThreads());
		return MAV;
		
	}
	public ModelAndView getThread(int ID)
	{
		ThreadsModel thread = threadService.getThread(ID);
		ModelAndView MAV = new ModelAndView(thread, "/WEB-INF/ThreadView/" + ID + ".jsp");
		return MAV;
		
	}
}
