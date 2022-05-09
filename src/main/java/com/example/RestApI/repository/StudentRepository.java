package com.example.RestApI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.RestApI.domain.Student;

//Repository interface which interacts with the database directly
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	List<Student> findByName(String name);
	
}
