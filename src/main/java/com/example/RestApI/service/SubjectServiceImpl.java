package com.example.RestApI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestApI.domain.Subject;
import com.example.RestApI.repository.SubjectRepository;

//service class which implements service interface to perform crud operations
@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectRepository subjectRepo;
	
	//method to save new subject into the database
	@Override
	public void saveSubject(Subject subject) {
		subjectRepo.save(subject);
	}

	//method returning list of subjects
	@Override
	public List<Subject> getAllSubjects() {
		return (List<Subject>) subjectRepo.findAll();
	}

}
