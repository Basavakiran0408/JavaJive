package com.learnsphere.service;

import java.util.List;

import com.learnsphere.entity.Course;
import com.learnsphere.entity.Lesson;

public interface TrainerService {

	String addCourse(Course c);
	
	String addLesson(Lesson l);

	Course getCourse(long c_id);

	List<Course> courseList();
	
	List<Course> deleteCourse(long c_id);
}
