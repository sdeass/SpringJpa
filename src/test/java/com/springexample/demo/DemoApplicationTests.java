package com.springexample.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springexample.demo.dao.PersonRepository;
import com.springexample.demo.dao.StudentRepository;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoApplicationTests {
	@BeforeEach
	void init() {
		System.out.println("creating");
	}

	@AfterEach
	void destory() {
		System.out.println("destoring");
	}
	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private StudentRepository studentRepository;

	@Test
	@Order(1)
	void contextLoads() {
	  Assertions.assertThat(personRepository.count()).isEqualTo(0);
	  Assertions.assertThat(studentRepository.count()).isEqualTo(0);
	}

}
