package com.kvs.sbeans;

public class Processor {
	private String ram;

	
	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

//	public Processor(String ram) {
//		super();
//		this.ram = ram;
//	}

	public void process() {
		System.out.println("Working Processor with RAM GB : "+ram);
	}

}
