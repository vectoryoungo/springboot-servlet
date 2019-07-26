/**
 * @create 2019-07-26 16:17
 * @desc configure filter
 **/
package com.american.vector.freeworld.servlet.config;

import com.american.vector.freeworld.servlet.filter.InitialFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean() {
        FilterRegistrationBean bean = new FilterRegistrationBean(new InitialFilter());
        List<String> urlPatterns = new ArrayList<>();
        urlPatterns.add("/*");
        bean.setUrlPatterns(urlPatterns);
        return bean;
    }
}

