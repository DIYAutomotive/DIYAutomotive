package edu.neumont.diyauto.Filters;

import java.io.IOException;
import java.security.Principal;

import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import edu.neumont.diyauto.Services.AccountService;

/**
 * A servlet filter that demonstrates how to use the ThreadLocal pattern
 * in a filter.
 * 
 * The filter pulls data from the request and stores it in the ThreadLocal
 * bean.  Other classes, like PersonService, can now reference CurrentUser.getUser()
 * to see who is currently logged in.
 */
@WebFilter("/*")
public class AccountFilter implements Filter {
	@Inject AccountService accountService;
	
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		if ( request instanceof HttpServletRequest ) {
			HttpServletRequest req = ((HttpServletRequest)request);
			try {
				// get what we want from the request
				Principal p = req.getUserPrincipal();
				
				if ( p != null ) {
					Account account = accountService.getAccountByUsername(p.getName());
					// store it in the ThreadLocal bean
					CurrentUser.setUser(account);
				}
				
				// proceed with the request
				chain.doFilter(request, response);
			} finally { 
				// remove user from the ThreadLocal bean so that this
				// thread is ready for the next request
				CurrentUser.setUser(null);
			}
		} else {
			// this almost never happens, but we have it here for completeness
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
