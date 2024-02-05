package com.learnsphere.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnsphere.entity.Course;
import com.learnsphere.entity.Lesson;
import com.learnsphere.repository.CourseRepo;
import com.learnsphere.repository.LessonRepo;
import com.learnsphere.service.TrainerService;

@Service
public class TrainerServiceImpl implements TrainerService {

	@Autowired
	 CourseRepo crepo;
	@Autowired
	LessonRepo lrepo;
		
	@Override
	public String addCourse(Course c) {
		
		crepo.save(c);
		System.out.println("Course Added Successfully");
		return "Course Added Successfully";
	}
	
	@Override
	public String addLesson(Lesson l) {
		
	       lrepo.save(l);
	       return "Lesson added Successfully";
	}

	@Override
	public Course getCourse(long c_id) {
		return crepo.findById(c_id).get();
		
	}

	@Override
	public List<Course> courseList() {
		List<Course> l = (List<Course>) crepo.findAll();
		return l;
	}

	@Override
	public List<Course> deleteCourse(long c_id) {
		crepo.deleteById(c_id);
		List<Course> l = (List<Course>) crepo.findAll();
		return l;
	}

}
