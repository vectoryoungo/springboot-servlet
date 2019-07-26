/**
 * @create 2019-07-26 15:20
 * @desc configure of servlet
 **/
package com.american.vector.freeworld.servlet.config;

import com.american.vector.freeworld.servlet.servletor.BusinessServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new BusinessServlet());
        bean.setLoadOnStartup(1);
        bean.setName("business");
        bean.addInitParameter("testBusiness","testValue");
        bean.addUrlMappings("/processing");
        return bean;
    }
}

