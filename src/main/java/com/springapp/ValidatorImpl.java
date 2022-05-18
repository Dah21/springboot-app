package com.springapp;

import com.springapp.entity.Department;
import com.springapp.entity.Student;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Configuration
public class ValidatorImpl implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if(target instanceof  Student){
        Student student =(Student) target;
        if(student.getFirstName() == null || student.getFirstName().isEmpty()){
            errors.rejectValue("firstName", "", "First name is required");

        }
        } /*else if (target instanceof Department) {

        }*/

        /**
         * sort  by desc
         * http://localhost:8080/api/std?sort=firstName,desc
         *
         * size
         * http://localhost:8080/api/std?page=1
         *
         * size and sort
         * http://localhost:8080/api/std?sort=firstName,desc&page=1
         *
         *
         * http://localhost:8080/api/std/search/findByFirstNameAndLastName?firstName=sidi&lastName=sd
         *
         *
         * **/
}
}
