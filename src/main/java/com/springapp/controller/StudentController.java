package com.springapp.controller;

import com.springapp.entity.Student;
import com.springapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return  studentService.getAllStudents();

    }

    @GetMapping("/getById/{id}")
    public Student getById(@PathVariable Long id){

        return studentService.getById(id);
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        return  studentService.createStudent(student);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return  studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        return  studentService.deleteStudent(id);
    }


}
