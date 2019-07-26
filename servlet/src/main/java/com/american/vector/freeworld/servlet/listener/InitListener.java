/**
 * @create 2019-07-26 16:25
 * @desc test init listener
 **/
package com.american.vector.freeworld.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        String p = servletContextEvent.getServletContext().getInitParameter("role");
        System.out.println("init parameter is " + p);
        System.out.println("listener initialized ... ");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("destroy....");
    }
}

