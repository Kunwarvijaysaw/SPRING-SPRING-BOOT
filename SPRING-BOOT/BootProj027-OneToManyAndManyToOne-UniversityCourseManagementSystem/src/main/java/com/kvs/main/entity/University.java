package com.kvs.main.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter@ToString
@AllArgsConstructor
@Entity
@Table
@NoArgsConstructor
public class University {

	@Id
	Long universityId;

	String universityName;
	String location;

	@OneToMany(mappedBy = "university", cascade = CascadeType.ALL)
	private List<Course> courses;

}
