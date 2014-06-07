package edu.neumont.diyauto.diyautoControllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import edu.neumont.diyauto.Models.ModelAndView;
import edu.neumont.diyauto.Models.ThreadsModel;
import edu.neumont.diyauto.Services.ThreadsService;

@RequestScoped
public class ThreadPostController {
    @Inject ThreadsService threadService;
    @Inject HttpServletRequest request;

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


    public void setThreadService(ThreadsService threadsService) {
        this.threadService = threadsService;
    }


    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }
}
