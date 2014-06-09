package edu.neumont.diyauto.Models;

/**
 * Created by Blepoidevin on 6/6/2014.
 */
public class ModelAndView {
    private Object object;
    private String ViewName;
    public ModelAndView(Object object, String ViewName)
    {
        this.object = object;
        this.ViewName = ViewName;
    }

    public Object getModel()
    {
        return object;
    }
    public String getViewName()
    {
        return ViewName;
    }
}