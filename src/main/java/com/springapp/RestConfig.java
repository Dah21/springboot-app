package com.springapp;

import com.springapp.entity.Student;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.cors.CorsConfiguration;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    //@Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsConfiguration cors){
        config.exposeIdsFor(Student.class);
    }

}
