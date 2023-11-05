package com.springexample.demo;

import org.assertj.core.api.Assertions;
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
