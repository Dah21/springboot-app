package com.springapp.repository;

import com.springapp.entity.FirstProjection;
import com.springapp.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@RepositoryRestResource(path= "std", collectionResourceRel = "stds")
public interface StudentRepository extends JpaRepository<Student, Long> {

    @RestResource(path="email"/*,exported = false*/)
     public List<Student>  findByEmail(String email);

    public List<Student>  findByFirstName(String firstName);

    public List<Student>  findByFirstNameAndLastName(String firstName, String lastName);


    public Page<Student> findByFirstNameOrLastName(String firstName, String lastName, Pageable pageable);




}
