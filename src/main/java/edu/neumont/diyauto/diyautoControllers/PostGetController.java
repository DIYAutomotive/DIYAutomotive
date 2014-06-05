package edu.neumont.diyauto.diyautoControllers;

import edu.neumont.diyauto.Models.Threads;
import edu.neumont.diyauto.ServiceLoader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostGetController
{
    HttpServletRequest request;
    HttpServletResponse response;
    Threads threads = ServiceLoader.threads;
    public PostGetController(HttpServletRequest request, HttpServletResponse response)
    {
        this.request = request;
        this.response = response;
    }

    public ModelAndView createPost()
    {
        ModelAndView MAV = new ModelAndView(null, "/WEB-INF/views/posts/CreatePost.jsp");
        return MAV;
    }
    public ModelAndView viewPost(int threadID, int postID)
    {
       ThreadModel thread = threads.getThread(threadID);
       PostModel post = thread.getPostById(postID);
        ModelAndView MAV = new ModelAndView(post, "/WEB-INF/views/posts/ViewPost.jsp");
        return MAV;
    }
}
