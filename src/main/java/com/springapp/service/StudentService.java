package com.springapp.service;

import com.springapp.entity.Student;
import com.springapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();

    }

    public Student getById(Long id) {
        return studentRepository.findById(id).get();

    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);

    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public String deleteStudent(Long id) {
         studentRepository.deleteById(id);
         return "student has been deleted";
    }
}
