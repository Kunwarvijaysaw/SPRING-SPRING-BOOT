package com.kvs.main.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString(exclude = "university") // CRITICAL: Prevents University -> Course -> University loop
@Setter
@Getter
@AllArgsConstructor
@Entity
@Table
@NoArgsConstructor

public class Course {

	@Id
	Long courseId;
	String courseName;
	String duration;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "cousef_id", referencedColumnName = "universityId")
	University university;

}
