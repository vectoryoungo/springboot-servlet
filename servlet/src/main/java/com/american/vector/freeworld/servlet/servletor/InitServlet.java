/**
 * @create 2019-07-26 14:53
 * @desc first servlet demo for springboot
 **/
package com.american.vector.freeworld.servlet.servletor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "init",urlPatterns = {"/initial","/initStart"},initParams = {@WebInitParam(name = "test",value = "testValue")},loadOnStartup = 1)
public class InitServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<center><h1>This is for your first test </h1></center>");
    }
}

