package com.example.RestApI.domain;

import java.util.*;

import javax.persistence.*;

//entity class for student
@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	@Column
	private String name;
	
	@Column
	private int age;
	
	@Column
	private String address;
	
	//setting one to many relation between two entities
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Subject> subjects;


	public int getId() {
		return studentId;
	}

	public void setId(int id) {
		this.studentId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
	
	
}
