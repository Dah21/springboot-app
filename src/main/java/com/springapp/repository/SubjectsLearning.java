package com.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsLearning extends JpaRepository<com.springapp.entity.SubjectsLearning, Long> {
}
