package com.kvs.main.entity;

public class Student {
	String name;
	String rollNo;
	String course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public Student(String name, String rollNo, String course) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", course=" + course + "]";
	}
	
	

}
