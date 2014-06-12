package edu.neumont.diyauto.diyautoControllers;

import edu.neumont.diyauto.Models.ModelAndView;
import edu.neumont.diyauto.Models.ThreadsModel;
import edu.neumont.diyauto.Services.ThreadsService;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.Collection;

@Stateless
@LocalBean
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

    public ModelAndView getThreadEdit(int ID)
    {
        ThreadsModel thread = threadService.getThread(ID);
        ModelAndView MAV = new ModelAndView(thread, "/WEB-INF/views/threads/ThreadEdit.jsp");
        return MAV;

    }

    public ModelAndView getThreadDeletionPage() {
        Collection<ThreadsModel> allThreads = threadService.getAll();
        // List allThreads = new ArrayList();
        //allThreads.add(ServiceLoader.thread);
        ModelAndView MAV = new ModelAndView(allThreads, "/WEB-INF/views/threads/AllThreadsDeletion.jsp");
        return MAV;
    }

    public ModelAndView getAllThreadPosts(int threadID) {
        ThreadsModel thread = threadService.getThread(threadID);
        ModelAndView MAV = new ModelAndView(thread, "/WEB-INF/views/threads/ThreadPostDeletion.jsp");
        return MAV;
    }
}
