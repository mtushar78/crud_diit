package com.diit.crud.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.GeneratorType;

import java.util.List;

@Entity 
public class Student {// ei khane eshe abar same vabe ekta ekta kore attribure dekhano shuru kore.. eitai loop !
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String department;
	@ManyToOne
	@JsonManagedReference
	private Semester semester;

	public Student() {
	}

	public Student(String fname, String lname, String email, String department, Semester semester) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.department = department;
		this.semester = semester;
	}

	public Semester getSemester() {
		return semester;
	}

	public void setSemester(Semester semester) {
		this.semester = semester;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}




}
