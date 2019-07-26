/**
 * @create 2019-07-26 16:27
 * @desc config listener
 **/
package com.american.vector.freeworld.servlet.config;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Configuration
public class ListenerConfig implements ServletContextInitializer{


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter("role","root");
    }
}

