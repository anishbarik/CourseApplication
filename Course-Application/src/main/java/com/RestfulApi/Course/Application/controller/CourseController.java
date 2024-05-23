package com.RestfulApi.Course.Application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.RestfulApi.Course.Application.entity.Course;
import com.RestfulApi.Course.Application.services.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService service ;
	
	@RequestMapping(value="/courses", method=RequestMethod.GET)
	public List<Course> getcourse()
	{
		return this.service.getcourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		
		return this.service.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody   Course course)// it will copy the body type json
	{
		return this.service.addCourse(course);
	}
	
	//for update of course 
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody   Course course)
	{
		return this.service.updateCourse(course);
	}
	
	//for deleting the course
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
	{
		try {
		this.service.deleteCourse(Long.parseLong(courseId));
		return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		//here we use Response entity to give our own custom htttp status code 
	}

}
