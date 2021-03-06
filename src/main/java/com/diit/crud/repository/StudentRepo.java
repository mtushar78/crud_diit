package com.diit.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diit.crud.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
