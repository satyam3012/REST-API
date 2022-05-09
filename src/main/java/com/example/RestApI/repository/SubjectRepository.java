package com.example.RestApI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.RestApI.domain.Subject;

//Repository interface which interacts with the database directly
@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
