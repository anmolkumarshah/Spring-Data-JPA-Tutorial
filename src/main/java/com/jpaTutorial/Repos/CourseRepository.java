package com.jpaTutorial.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpaTutorial.Entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
 