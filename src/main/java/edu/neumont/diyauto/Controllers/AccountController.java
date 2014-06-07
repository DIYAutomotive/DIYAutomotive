package edu.neumont.diyauto.Controllers;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import edu.neumont.diyauto.Framework.UrlMapping;
import edu.neumont.diyauto.Models.ModelAndView;
import edu.neumont.diyauto.Services.AccountService;
import edu.neumont.diyauto.security.PasswordEncoder;


@Stateless
@LocalBean
public class AccountController  {
	@Inject AccountService accountService;
	@Inject HttpServletRequest request;
	@Inject PasswordEncoder passwordEncoder;
	
	@UrlMapping(value="/account", method="POST")
	public ModelAndView executeCreateAccount() {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//TODO
//		Account account = new Account();
//		account.setUsername(username);
//		account.setPassword(passwordEncoder.encode(password));
//		
//		accountService.updateAccount(account);
//		
//		return new ModelAndView(null, request.getContextPath() + "/app/student/list", true);
		return null;
	}

	@UrlMapping(value="/account", method="GET")
	public ModelAndView prepareCreateAccount() {
		return new ModelAndView(null, "/WEB-INF/account/edit.jsp");
	}

}