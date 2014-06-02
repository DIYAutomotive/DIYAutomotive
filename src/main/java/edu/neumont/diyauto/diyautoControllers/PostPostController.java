package edu.neumont.diyauto.diyautoControllers;

import edu.neumont.diyauto.Models.ModelAndView;
import edu.neumont.diyauto.Models.PostModel;
import edu.neumont.diyauto.Models.ThreadModel;
import edu.neumont.diyauto.Models.Threads;
import edu.neumont.diyauto.ServiceLoader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostPostController
{
    HttpServletRequest request;
    HttpServletResponse response;
    Threads threads = ServiceLoader.threads;
    public PostPostController(HttpServletRequest request, HttpServletResponse response)
    {
        this.request = request;
        this.response = response;
    }
    public ModelAndView createPost(int threadID)
    {
        int ID = ServiceLoader.threadID++;
        String userName = request.getParameter("user");
        String title = request.getParameter("title");
        String body = request.getParameter("postBody");
        //String tags = request.getParameter()
        PostModel post = new PostModel(title,ID, 0, body);
        ThreadModel thread = threads.getThread(threadID);
        thread.getPosts().AddPost(post);
        ModelAndView MAV = new ModelAndView(null, "/threads/" + threadID+"/post/" + ID);

        return MAV;
    }
}
