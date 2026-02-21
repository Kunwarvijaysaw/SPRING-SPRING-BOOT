package com.kvs.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kvs.main.entiry.Student;

@Repository
public class StudentDao {

    @Autowired
    DataSource dataSource;

    // CREATE
    public String saveStudent(Student student) throws SQLException {
        Connection con = dataSource.getConnection();
        PreparedStatement pstmt =
                con.prepareStatement("INSERT INTO student500 VALUES(?,?,?,?)");

        pstmt.setLong(1, student.getId());
        pstmt.setString(2, student.getName());
        pstmt.setString(3, student.getSubject());
        pstmt.setDouble(4, student.getMarks());

        int k = pstmt.executeUpdate();
        return (k > 0) ?
                "Student Saved With id: " + student.getId()
                : "Invalid Input";
    }

    // READ
    public List<Student> findAll() throws SQLException {

        List<Student> list = new ArrayList<>();
        Connection con = dataSource.getConnection();
        PreparedStatement pstmt =
                con.prepareStatement("SELECT * FROM student500");

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            list.add(new Student(
                    rs.getLong(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDouble(4)));
        }
        return list;
    }

    // UPDATE
    public String updateStudent(long id, double marks) throws SQLException {

        Connection con = dataSource.getConnection();
        PreparedStatement pstmt =
                con.prepareStatement("UPDATE student500 SET marks=? WHERE id=?");

        pstmt.setDouble(1, marks);
        pstmt.setLong(2, id);

        int k = pstmt.executeUpdate();

        return (k > 0) ?
                "Student Updated Successfully"
                : "Student Not Found";
    }

    // DELETE
    public String deleteStudent(long id) throws SQLException {

        Connection con = dataSource.getConnection();
        PreparedStatement pstmt =
                con.prepareStatement("DELETE FROM student500 WHERE id=?");

        pstmt.setLong(1, id);

        int k = pstmt.executeUpdate();

        return (k > 0) ?
                "Student Deleted Successfully"
                : "Student Not Found";
    }

    // AVERAGE
//    public double calculateAvgMarks() throws SQLException {
//
//        double avg = 0.0;
//        Connection con = dataSource.getConnection();
//        PreparedStatement pstmt =
//                con.prepareStatement("SELECT AVG(marks) FROM student500");
//
//        ResultSet rs = pstmt.executeQuery();
//
//        if (rs.next()) {
//            avg = rs.getDouble(1);
//        }
//
//        return avg;
//    }
}