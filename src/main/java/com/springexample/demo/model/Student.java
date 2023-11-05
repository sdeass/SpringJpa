package com.springexample.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String number;
   private String name;
   @ManyToOne(fetch = FetchType.EAGER,cascade = {CascadeType.MERGE})
   @JoinTable(name= "class_t_student",joinColumns = @JoinColumn(name="student_id"),
   inverseJoinColumns = @JoinColumn(name = "person_id"))
   private Person person;
    
}
