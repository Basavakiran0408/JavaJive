package com.learnsphere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnsphere.entity.Lesson;

public interface LessonRepo extends JpaRepository<Lesson, Long> {

}
