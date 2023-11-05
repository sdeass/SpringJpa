package com.springexample.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springexample.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    
}
