package com.learnsphere.repository;

import org.springframework.data.repository.CrudRepository;

import com.learnsphere.entity.Course;

public interface CourseRepo extends CrudRepository<Course, Long> {

}
