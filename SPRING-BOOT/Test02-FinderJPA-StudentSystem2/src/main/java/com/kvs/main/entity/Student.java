package com.kvs.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Student421")
public class Student {
	@Id
	private Long id;

    private String name;
    private String course;
    private Boolean completed;
    private double fee;

}
