package com.example.Api.controller;


import com.example.Api.entity.Student;
import com.example.Api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping( path = "api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
    }

    @GetMapping("/{student_id}")
    public Optional<Student> getById(@PathVariable("Student_id")Integer student_id){
         return studentService.getStudent(student_id);

    }


    @GetMapping
    public List<Student> getAll(){
        return  studentService.getStudents();

    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Student student){
            studentService.saveOrupdate(student);
            getAll();

    }

    @DeleteMapping("/{Student_id}")
    public void DeleteStudent(@PathVariable("Student_id")Integer student_id){
            studentService.delete(student_id);
    }


}
