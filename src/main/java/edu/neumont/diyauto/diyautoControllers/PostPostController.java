package edu.neumont.diyauto.diyautoControllers;

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
        thread.addPost(post);
        ModelAndView MAV = new ModelAndView(null, "/threads/" + threadID+"/post/" + ID);

        return MAV;
    }
    public ModelAndView addComment(int threadID, int postID)
    {
        ThreadModel thread = threads.getThread(threadID);
        PostModel post = thread.getPostById(postID);
        String comment = request.getParameter("comment");
        CommentModel Comment = new CommentModel(0,null,comment);
        threads.getThread(threadID).getPostById(postID).addComment(Comment);
        ModelAndView MAV = new ModelAndView(null, "/threads/" + threadID+"/post/" + postID);
        return MAV;
    }
}
