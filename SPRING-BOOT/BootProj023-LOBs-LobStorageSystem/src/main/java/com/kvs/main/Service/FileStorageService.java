package com.kvs.main.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvs.main.Entity.FileRecord;
import com.kvs.main.Repository.FileRepository;

@Service
public class FileStorageService {

	@Autowired
	FileRepository fileRepository;

	public void storeFileAndImage(String textFilePath, String imageFilePath) throws IOException {
	   
		String textContent = Files.readString(Paths.get(textFilePath));;

	    
		File file2=new File(imageFilePath);
		
		FileInputStream fis2 = new FileInputStream(file2);
		byte[] allBytes = fis2.readAllBytes();
		
		FileRecord fileRecord = new FileRecord(101, "proffile data", textContent, allBytes);
		fileRepository.save(fileRecord);
	}

	public void retrieveAndWriteToDisk(Long id, String outputTextPath, String outputImagePath) throws IOException {
		
		FileRecord record = fileRepository.findById(id).orElseThrow();

		Files.writeString(Paths.get(outputTextPath), record.getFileText());

		Files.write(Paths.get(outputImagePath), record.getFileImage());

		System.out.println("Files written successfully!");

	}
}
