package com.RestfulApi.Course.Application.services;

import java.util.List;

import com.RestfulApi.Course.Application.entity.Course;

public interface CourseService {
	
	public List<Course> getcourses();//in interface we cant declare body 

	 public Course getCourse(long courseId);
	 
	 public Course addCourse(Course course);

	 public Course updateCourse(Course course);
	 
	 public void  deleteCourse (long parseLong);
	 
	
}
