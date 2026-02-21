package com.kvs.main.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kvs.main.entiry.Student;
import com.kvs.main.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    StudentService service;

    // CREATE
    public String addStudent(Student student) throws SQLException {
        return service.insertStudent(student);
    }

    // READ
    public List<Student> viewAllStudent() throws SQLException {
        return service.getAllStudent();
    }

    // UPDATE
    public String updateStudent(long id, double marks) throws SQLException {
        return service.updateStudent(id, marks);
    }

    // DELETE
    public String deleteStudent(long id) throws SQLException {
        return service.deleteStudent(id);
    }

    // AVERAGE
//    public double showAvgMarks() throws SQLException {
//        return service.calAvgMarks();
//    }
}