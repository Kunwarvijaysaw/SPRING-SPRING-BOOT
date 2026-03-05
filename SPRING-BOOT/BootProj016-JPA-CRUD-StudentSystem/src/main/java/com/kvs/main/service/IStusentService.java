package com.kvs.main.service;

import java.util.List;
import java.util.Optional;

import com.kvs.main.entity.Student;

public interface IStusentService {
	// insert one student
    public Student saveStudent(Student student);

    // insert multiple students
    public Iterable<Student> saveAllStudents(List<Student> students);

    // get student by id
    public Optional<Student> getStudentById(Long rollNo);

    // get all students
    public Iterable<Student> getAllStudents();

    // check student exists
    public boolean isStudentExist(Long rollNo);

    // count students
    public long getStudentCount();

    // delete student by id
    public void deleteStudentById(Long rollNo);

    // delete student object
    public void deleteStudent(Student student);

    // delete multiple students
    public void deleteStudents(List<Student> students);

    // delete all students
    public void deleteAllStudents();

}
