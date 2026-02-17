package com.kvs.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Laptop {
	@Autowired
	Processor processor;

//	public Laptop(Processor processor) {
//		super();
//		this.processor = processor;
//	}
	
	
	
	public void compile() {
		processor.process();
		System.out.println("Compile.......!");
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	
	
	

}
