package com.example.RestApI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.RestApI.domain.Student;
import com.example.RestApI.service.StudentService;
import com.example.RestApI.service.SubjectService;

//It is the controller class which handles all the user requests through browser
@Controller
@ResponseBody
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private SubjectService subjectService;
	
	//Handler method returning json form of all students
	@GetMapping("/")
	public List<Student> homePage(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		model.addAttribute("subjects", subjectService.getAllSubjects());
		return studentService.getAllStudents();
	}
	
	//handler method to get new form to add new student
	@GetMapping("/addStudent")
	public String addStudent(Model model) {
		model.addAttribute("student", new Student());
		return "addStudent";
	}
	
	//handler method to save the new student data into the database
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/";
	}
	
	//handler method to get the student list by their name
	@GetMapping("/findByName")
	public List<Student> findByname(@RequestParam String name, Model model) {
		List<Student> studentList = studentService.getStudentByName(name);
		model.addAttribute("studentList", studentList);
		return studentList;
	}
}
