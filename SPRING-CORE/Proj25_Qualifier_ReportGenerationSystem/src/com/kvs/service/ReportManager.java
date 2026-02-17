package com.kvs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class ReportManager {
	ReportService reportService;

	@Autowired
	public ReportManager(@Qualifier("excel") ReportService reportService) {
		super();
		this.reportService = reportService;
	}
	
	public void reportGenerator() {
		reportService.generateReport();
	}

}
