package com.kvs.service;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PDFReportService implements ReportService{

	@Override
	public void generateReport() {
		System.out.println("PDF Report Generator......!");
		
		
	}

	

}
