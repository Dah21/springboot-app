package com.springapp.repository;

import com.springapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
