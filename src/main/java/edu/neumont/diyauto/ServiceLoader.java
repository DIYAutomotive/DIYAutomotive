package edu.neumont.diyauto;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import edu.neumont.diyauto.Models.ThreadModel;
import edu.neumont.diyauto.Models.Threads;


@WebListener
public class ServiceLoader implements ServletContextListener 
{

	public static Threads threads;
	public static int threadID;

	@Override
	public void contextInitialized(ServletContextEvent arg0) {

		threadID = 0001;
        threads = new Threads();
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub	
	}
}
