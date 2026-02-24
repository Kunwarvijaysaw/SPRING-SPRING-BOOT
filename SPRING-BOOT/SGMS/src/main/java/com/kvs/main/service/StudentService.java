package com.kvs.main.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvs.main.dao.StudentDao;
import com.kvs.main.entiry.Student;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public String insertStudent(Student student) throws SQLException {
        return studentDao.saveStudent(student);
    }

    public List<Student> getAllStudent() throws SQLException {
        return studentDao.findAll();
    }



    // UPDATE
    public String updateStudent(long id, double salary) throws SQLException {
        return studentDao.updateStudent(id, salary);
    }

    // DELETE
    public String deleteStudent(long id) throws SQLException {
        return studentDao.deleteStudent(id);
    }
}