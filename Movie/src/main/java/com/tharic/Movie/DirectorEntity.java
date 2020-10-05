package com.tharic.Movie;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "director")
public class DirectorEntity {
	
	@Id
	private Integer directorId;
	private String directorName;
	private Integer salary;
	
	
	
	public DirectorEntity(Integer directorId, String directorName, Integer salary) {
		this.directorId = directorId;
		this.directorName = directorName;
		this.salary = salary;
	}
	public Integer getDirectorId() {
		return directorId;
	}
	public void setDirectorId(Integer directorId) {
		this.directorId = directorId;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	
}
