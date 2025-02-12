package com.example.Api.repository;

import com.example.Api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface StudentRepository extends JpaRepository<Student, Integer> {
}
