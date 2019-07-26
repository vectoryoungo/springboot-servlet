/**
 * @create 2019-07-26 16:13
 * @desc initial container filter
 **/
package com.american.vector.freeworld.servlet.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class InitialFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init method ");
        System.out.println("filter name is " + filterConfig.getFilterName());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Initial filter run ....start");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("Initial filter run ...end");
    }

    @Override
    public void destroy() {
        System.out.println("do destroy....");
    }
}

