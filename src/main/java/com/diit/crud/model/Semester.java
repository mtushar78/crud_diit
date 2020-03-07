package com.diit.crud.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Semester { //bujhte parso ??
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String semester_no;
    @OneToMany(mappedBy = "semester")
    @JsonBackReference
    private List<Student> student;

    @OneToMany(mappedBy = "semester")
    @JsonManagedReference
    private List<Course> courses;

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Semester() {
    }

    public Semester(String semester_no) {
        this.semester_no = semester_no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSemester_no() {
        return semester_no;
    }

    public void setSemester_no(String semester_no,List<Course> courses, List<Student> student) {
        this.semester_no = semester_no;
        this.courses=courses;
        this.student=student;
    }
}
