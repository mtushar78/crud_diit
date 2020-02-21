package com.diit.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diit.crud.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
