package com.diit.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diit.crud.model.Student;
import com.diit.crud.repository.StudentRepo;



@RestController
public class StudentController {
	@Autowired
	StudentRepo repository;
	
	@GetMapping(value = "/all")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> students = repository.findAll();
		return new ResponseEntity<List<Student>>(students, new HttpHeaders(), HttpStatus.OK);
	}
}
