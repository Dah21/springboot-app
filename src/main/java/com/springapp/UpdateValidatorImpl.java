package com.springapp;

import com.springapp.entity.Student;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Configuration
public class UpdateValidatorImpl implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if(target instanceof  Student){
        Student student =(Student) target;
        if(student.getLastName() == null || student.getLastName().isEmpty()){
            errors.rejectValue("lastName", "", "Last name is required");

        }
        } /*else if (target instanceof Department) {

        }*/
}
}
