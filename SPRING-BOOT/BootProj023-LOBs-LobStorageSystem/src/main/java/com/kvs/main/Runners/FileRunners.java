package com.kvs.main.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kvs.main.Service.FileStorageService;

@Component
public class FileRunners implements CommandLineRunner {
	
	@Autowired
	FileStorageService fileStorageService;
	

	@Override
	public void run(String... args) throws Exception {
		String inputText = "C:\\Users\\kunwa\\Downloads\\SpringBoot_TaskOn_LargeObjects.txt";
		String inputImage = "C:\\Users\\kunwa\\Downloads\\KVS111.jpeg";

		String outputText = "C:\\Users\\kunwa\\Downloads\\OUTPUT\\Output.txt";
		String outputImage = "C:\\Users\\kunwa\\Downloads\\OUTPUT\\Output.jpeg";

		fileStorageService.storeFileAndImage(inputText, inputImage);

		fileStorageService.retrieveAndWriteToDisk(101L, outputText, outputImage);
		
		
	}

}
