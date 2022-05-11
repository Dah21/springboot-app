package com.springapp.repository;

import com.springapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

@RepositoryRestResource(path= "std", collectionResourceRel = "stds")
public interface StudentRepository extends JpaRepository<Student, Long> {

}
