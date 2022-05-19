package com.springapp;

import com.springapp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    @Autowired
    private  ValidatorImpl ValidatorImpl;

    @Autowired
    private  UpdateValidatorImpl updateValidatoImp;




    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {

        config.exposeIdsFor(Student.class);
    }

    @Override
    public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener  validatingListener){
        validatingListener.addValidator("beforeCreate", ValidatorImpl);
        validatingListener.addValidator("beforeSave", updateValidatoImp);
    }

}
