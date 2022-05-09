package com.example.RestApI.service;

import java.util.List;

import com.example.RestApI.domain.Subject;

//service interface which interacts with repository class
public interface SubjectService {
	List<Subject> getAllSubjects();
	void saveSubject(Subject subject);
}
