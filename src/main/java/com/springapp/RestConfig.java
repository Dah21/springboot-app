package com.springapp;

import com.springapp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.cors.CorsConfiguration;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    @Autowired
    private  ValidatorImpl validatorImpl;

    @Autowired
    private  UpdateValidatorImpl updateValidatoImp;
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsConfiguration cors){
        config.exposeIdsFor(Student.class);
    }




    @Override
    public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener  validatingListener){
        validatingListener.addValidator("beforeCreate", validatorImpl);
        validatingListener.addValidator("beforeSave", updateValidatoImp);
    }

}
