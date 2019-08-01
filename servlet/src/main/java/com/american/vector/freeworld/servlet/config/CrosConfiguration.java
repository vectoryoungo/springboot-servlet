/**
 * @create 2019-08-01 14:49
 * @desc cross-domain
 **/
package com.american.vector.freeworld.servlet.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CrosConfiguration extends WebMvcConfigurerAdapter{

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
                .allowedMethods("GET","PUT","POST","DELETE")
                .allowCredentials(true)
                .allowedOrigins("*")
                .maxAge(3600);
    }
}

