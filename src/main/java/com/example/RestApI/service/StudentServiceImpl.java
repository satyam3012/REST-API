package com.example.RestApI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestApI.domain.Student;
import com.example.RestApI.repository.StudentRepository;

//service class which implements service interface to perform crud operations
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;

	//method returning list of students
	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) studentRepo.findAll();
	}
	
	//method to save new student into the database
	@Override
	public void saveStudent(Student student) {
		studentRepo.save(student);
	}

	//method to get list of students by their name
	@Override
	public List<Student> getStudentByName(String name) {
		return studentRepo.findByName(name);
	}


}
