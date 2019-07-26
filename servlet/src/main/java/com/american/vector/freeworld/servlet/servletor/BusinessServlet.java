/**
 * @create 2019-07-26 15:17
 * @desc test config class start servlet
 **/
package com.american.vector.freeworld.servlet.servletor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BusinessServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<center><h1>Start Business processing ....</h1></center>");

    }
}

