package com.learnsphere.entity;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Course {

	@Id
	public long c_id;
	
	 public String c_name;
	
	public String c_price;
	
	@OneToMany
	List<Lesson> lessons;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(long c_id, String c_name, String c_price, List<Lesson> lessons) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_price = c_price;
		this.lessons = lessons;
	}

	public long getC_id() {
		return c_id;
	}

	public void setC_id(long c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_price() {
		return c_price;
	}

	public void setC_price(String c_price) {
		this.c_price = c_price;
	}

	public List<Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}

	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", c_name=" + c_name + ", c_price=" + c_price + ", lessons=" + lessons + "]";
	}
		
}
