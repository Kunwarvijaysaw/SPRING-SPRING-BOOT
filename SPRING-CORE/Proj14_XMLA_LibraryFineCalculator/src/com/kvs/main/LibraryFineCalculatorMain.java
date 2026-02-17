package com.kvs.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kvs.sbeans.LibraryFineCalculator;

public class LibraryFineCalculatorMain {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/kvs/cfgs/NewFile.xml");
		
		LibraryFineCalculator calc = (LibraryFineCalculator)ctx.getBean("lfc");
		calc.setFinePerDay(5);
		calc.setLateDays(9);
		
		System.out.println("Library Total Foine : Rs "+calc.calculateFine());
	}

}
