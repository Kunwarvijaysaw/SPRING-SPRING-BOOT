package com.kvs.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kvs.main.entity.Student;
import com.kvs.main.repository.StudentRepository;


@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	public Student addStudent(Student s) {
		Student save=studentRepository.save(s);
		if(save!=null) {
			System.out.println("Data Inserted sucessfully...!");
		}else {
			System.out.println("Data not Inserted ...!");
		}
		return save;
		
	}
	
	public List<Student> getAllStudent(){
		List<Student> list = new ArrayList<>();
        studentRepository.findAll().forEach(list::add);
        return list;
	}
	
	public Optional<Student> findStudentById(Long id) {
		return studentRepository.findById(id);
	}
	
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}
	
	public void updateStudent(Long id, String name) {
        Student s = studentRepository.findById(id).get();
        s.setName(name);
        studentRepository.save(s);
    }
	
}
