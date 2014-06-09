package edu.neumont.diyauto.diyautoControllers;

import edu.neumont.diyauto.Models.ModelAndView;
import edu.neumont.diyauto.Models.ThreadsModel;
import edu.neumont.diyauto.Services.ThreadsService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.Collection;
@RequestScoped
public class ThreadGetController
{
    @Inject ThreadsService threadService;

    public ModelAndView getAll()
    {
        Collection<ThreadsModel> allThreads = threadService.getAll();
        ModelAndView MAV = new ModelAndView(allThreads,"/WEB-INF/views/threads/AllThreadsView.jsp");
        return MAV;
    }
	public ModelAndView createThread()
	{

		ModelAndView MAV = new ModelAndView(null, "/WEB-INF/views/threads/CreateThread.jsp");
		return MAV;

	}
	public ModelAndView getThread(int ID)
	{
		ThreadsModel thread = threadService.getThread(ID);
		ModelAndView MAV = new ModelAndView(thread, "/WEB-INF/views/threads/ThreadView.jsp");
		return MAV;

	}


}
