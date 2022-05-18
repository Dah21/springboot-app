package com.springapp.entity;


import org.springframework.data.rest.core.config.Projection;

@Projection(types = Student.class, name = "secondProjection")
public interface SecondProjection {
      Long getId();
      String getFirstName();


}
