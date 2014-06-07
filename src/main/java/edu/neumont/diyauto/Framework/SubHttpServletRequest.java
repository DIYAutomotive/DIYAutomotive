package edu.neumont.diyauto.Framework;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * Created by jjensen on 6/6/14.
 */
public class SubHttpServletRequest extends HttpServletRequestWrapper implements ISubHttpServletRequest {

    public SubHttpServletRequest(HttpServletRequest request) {
        super(request);
    }

}
