package com.RestfulApi.Course.Application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	
	
	@Id
	@GeneratedValue
	private long id ;
	private String titel ;
	private String desc ;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(long id, String titel, String desc) {
		super();
		this.id = id;
		this.titel = titel;
		this.desc = desc;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", titel=" + titel + ", desc=" + desc + "]";
	}
	
	
	
	

}
