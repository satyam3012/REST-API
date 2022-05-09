package com.example.RestApI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.RestApI.domain.*;
import java.util.*;

import com.example.RestApI.service.SubjectService;

//It is the controller class which handles all the user requests through browser
@Controller
@ResponseBody
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	//Handler method returning json form of all subjects
	@GetMapping("/subjects")
	public List<Subject> getSubjects(Model model) {
		model.addAttribute("subjectList", subjectService.getAllSubjects());
		return subjectService.getAllSubjects();
	}
}
