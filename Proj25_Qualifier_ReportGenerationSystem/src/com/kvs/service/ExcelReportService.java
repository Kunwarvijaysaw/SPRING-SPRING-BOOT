package com.kvs.service;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReportService implements ReportService {

	@Override
	public void generateReport() {
		System.out.println("Excel repot generated............!");
		
	}

}
