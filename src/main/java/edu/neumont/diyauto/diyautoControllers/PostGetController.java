package edu.neumont.diyauto.diyautoControllers;

import edu.neumont.diyauto.Models.ModelAndView;
import edu.neumont.diyauto.Models.PostModel;
import edu.neumont.diyauto.Models.ThreadsModel;
import edu.neumont.diyauto.Services.PostsService;
import edu.neumont.diyauto.Services.ThreadsService;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Stateless
@LocalBean
public class PostGetController
{
    HttpServletRequest request;
    HttpServletResponse response;
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
