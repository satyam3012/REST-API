package com.example.RestApI.service;

import com.example.RestApI.domain.*;
import java.util.*;

//service interface which interacts with repository class
public interface StudentService {
	List<Student> getAllStudents();
	void saveStudent(Student student);
	List<Student> getStudentByName(String name);
}
