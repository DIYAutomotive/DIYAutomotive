package edu.neumont.diyauto.diyautoControllers;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import edu.neumont.diyauto.Models.ModelAndView;
import edu.neumont.diyauto.Models.PostModel;
import edu.neumont.diyauto.Models.ThreadsModel;
import edu.neumont.diyauto.Services.PostsService;
import edu.neumont.diyauto.Services.ThreadsService;

@RequestScoped
public class PostGetController
{
    @Inject HttpServletRequest request;
    @Inject ThreadsService threadsService;
    @Inject PostsService postsService;


    public ModelAndView createPost()
    {
        ModelAndView MAV = new ModelAndView(null, "/WEB-INF/views/posts/CreatePost.jsp");
        return MAV;
    }
    public ModelAndView viewPost(int threadID, int postID)
    {
       ThreadsModel thread = threadsService.getThread(threadID);
       PostModel post = postsService.getPost(postID);
        ModelAndView MAV = new ModelAndView(post, "/WEB-INF/views/posts/ViewPost.jsp");
        return MAV;
    }
}
