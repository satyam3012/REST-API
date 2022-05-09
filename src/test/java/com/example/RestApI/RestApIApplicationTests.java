package com.example.RestApI;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.RestApI.domain.Student;
import com.example.RestApI.domain.Subject;
import com.example.RestApI.repository.StudentRepository;
import com.example.RestApI.repository.SubjectRepository;
import com.example.RestApI.service.StudentService;
import com.example.RestApI.service.SubjectService;

//class for testing all the operations
@RunWith(SpringRunner.class)
@SpringBootTest
class RestApIApplicationTests {

	@Autowired
	private StudentService service;
	
	@Autowired
	private SubjectService subjectService;
	
	@MockBean
	private StudentRepository repo;
	
	@MockBean
	private SubjectRepository subjectRepo;
	
	//handler method to test the working of getting student list
	@Test
	public void getStudentsTest() {
		when(repo.findAll()).thenReturn(Stream
				.of(new Student()).collect(Collectors.toList()));
		assertEquals(1, service.getAllStudents().size());
	}
	
	//handler method to test the working for getting student list by their name
	@Test
	public void getStudentByNameTest() {
		String name = "Student";
		when(repo.findByName(name)).thenReturn(Stream
				.of(new Student()).collect(Collectors.toList()));
		assertEquals(1, service.getStudentByName(name).size());
	}
	
	//handler method to test the working of getting subject list
	@Test
	public void getSubjectsTest() {
		when(subjectRepo.findAll()).thenReturn(Stream
				.of(new Subject()).collect(Collectors.toList()));
		assertEquals(1, subjectService.getAllSubjects().size());
	}

}
