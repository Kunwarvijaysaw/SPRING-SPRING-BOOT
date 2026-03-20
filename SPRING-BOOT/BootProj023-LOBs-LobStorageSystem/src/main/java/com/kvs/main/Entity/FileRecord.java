package com.kvs.main.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FileRecord {

	@Id
	long id;

	String fileName;

	@Lob
	String fileText;

	@Lob
	byte[] fileImage;
	

}
