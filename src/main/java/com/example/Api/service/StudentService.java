package com.example.Api.service;


import com.example.Api.entity.Student;
import com.example.Api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
   @Autowired
    StudentRepository studentRepository;
   public List<Student> getStudents(){
       return  studentRepository.findAll();
   }

   public Optional<Student> getStudent(Integer id){
       return  studentRepository.findById(id);
   }

   public  void saveOrupdate(Student student){
       studentRepository.save(student);
   }

   public  void delete(Integer id){
       studentRepository.deleteById(id);
   }
}
