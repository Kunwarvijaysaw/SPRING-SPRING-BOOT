package com.kvs.main.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kvs.main.model.Employee;

@Repository
public class EmployeeRepository {
	
	@Autowired
	DataSource dataSource;
	
	public String addEmployee(Employee employee) throws SQLException {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement("INSERT INTO EMPLOYEE501 VALUES(?,?,?,?,?)");


		pstmt.setLong(1, employee.getId());
        pstmt.setString(2, employee.getName());
        pstmt.setString(3, employee.getDepartment());
        pstmt.setDouble(4, employee.getSalary());
        pstmt.setString(5, employee.getRole());


        int k = pstmt.executeUpdate();
        return (k > 0) ?
                "Employee Saved With id: " + employee.getId()
                : "Invalid Input";
	}
	// READ
    public List<Employee> findAll() throws SQLException {

        List<Employee> list = new ArrayList<>();
        Connection con = dataSource.getConnection();
        PreparedStatement pstmt =
                con.prepareStatement("SELECT * FROM employee501");

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            list.add(new Employee(
                    rs.getLong(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDouble(4),
            		rs.getString(5)));
        }
        return list;
    }

    // UPDATE
    public String updateEmployee(long id, double salary) throws SQLException {

        Connection con = dataSource.getConnection();
        PreparedStatement pstmt =
                con.prepareStatement("UPDATE employee501 SET salary=? WHERE id=?");

        pstmt.setDouble(1, salary);
        pstmt.setLong(2, id);

        int k = pstmt.executeUpdate();

        return (k > 0) ?
                "Employee Updated Successfully"
                : "Employee Not Found";
    }

    // DELETE
    public String deleteEmployee(long id) throws SQLException {

        Connection con = dataSource.getConnection();
        PreparedStatement pstmt =
                con.prepareStatement("DELETE FROM employee501 WHERE id=?");

        pstmt.setLong(1, id);

        int k = pstmt.executeUpdate();

        return (k > 0) ?
                "Employee Deleted Successfully"
                : "Employee Not Found";
    }

  
}