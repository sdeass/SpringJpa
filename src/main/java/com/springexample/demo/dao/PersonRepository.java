package com.springexample.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springexample.demo.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    
}
