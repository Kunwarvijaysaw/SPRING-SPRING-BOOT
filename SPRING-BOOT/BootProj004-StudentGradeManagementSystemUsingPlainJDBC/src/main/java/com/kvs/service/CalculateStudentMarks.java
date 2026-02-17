package com.kvs.service;

import java.util.ArrayList;

import com.kvs.Entitiy.Student;

public class CalculateStudentMarks {

	public double calculate(ArrayList<Student>stu)
	{
		double sum=0;
		for(int i=0;i<stu.size();i++)
		{
			sum+=stu.get(i).getMarks();
		}
		
		return sum/stu.size();
	}
}
