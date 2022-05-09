package com.example.RestApI.domain;

import javax.persistence.*;

//entity class for subject
@Entity
@Table
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subjectId;
	
	@Column
	private String name;
	
	@Column
	private String marks;
	
	//join operation through the common column name
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "studId", nullable = false)
	private Student student;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	
	
}
