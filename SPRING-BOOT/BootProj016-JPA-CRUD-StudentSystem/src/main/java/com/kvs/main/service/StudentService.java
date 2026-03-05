package com.kvs.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvs.main.entity.Student;
import com.kvs.main.repository.StudentRepository;

@Service
public class StudentService implements IStusentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		Student save=studentRepository.save(student);
		if(save!=null) {
			System.out.println("Data Insertedv Sucessfully.......!!");
		}else {
			System.out.println("Invalid Data....");
		}
		return save;
	}

	@Override
	public Iterable<Student> saveAllStudents(List<Student> students) {
		
		return null;
	}

	@Override
	public Optional<Student> getStudentById(Long rollNo) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Iterable<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isStudentExist(Long rollNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getStudentCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteStudentById(Long rollNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudents(List<Student> students) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllStudents() {
		// TODO Auto-generated method stub
		
	}
	

}
