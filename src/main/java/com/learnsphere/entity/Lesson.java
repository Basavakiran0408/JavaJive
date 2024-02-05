package com.learnsphere.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lesson {

	@Id
	long l_id;
	String l_name;
	String topics;
	String link;
	
	@ManyToOne
	Course course;

	public Lesson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lesson(long l_id, String l_name, String topics, String link, Course course) {
		super();
		this.l_id = l_id;
		this.l_name = l_name;
		this.topics = topics;
		this.link = link;
		this.course = course;
	}

	public long getL_id() {
		return l_id;
	}

	public void setL_id(long l_id) {
		this.l_id = l_id;
	}


	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getTopics() {
		return topics;
	}

	public void setTopics(String topics) {
		this.topics = topics;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Lesson [l_id=" + l_id + ", l_name=" + l_name + ", topics=" + topics + ", link="
				+ link + ", course=" + course + "]";
	}



	
}
