package com.RestfulApi.Course.Application.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestfulApi.Course.Application.Repository.CourseSpringJpaRepo;
import com.RestfulApi.Course.Application.entity.Course;

@Service // its indicate that its a service layer class
public class CourseServiceImpl implements CourseService {
	
	//List<Course> list = new ArrayList<>();
	
	@Autowired
	private CourseSpringJpaRepo repo;//we create variable to use that interface 
	
	public CourseServiceImpl()
	{
//	  list.add(new Course(145 ,"java", "its a basic"));	
//	  list.add(new Course(143 ,"java 8", "its a advance "));
//	  list.add(new Course(175 ,"java spring boot", "its a framework"));
	}

	//to find all courses
	@Override
	public List<Course> getcourses() {
		
		
		return repo.findAll();//we add all list in constructor and return that value as list 
	}

	@Override
	public Course getCourse(long courseId) {
		
//		Course c  = null;
//		for(Course course : list)//we traverse through each list value if get id value is same as course then return that value
//		{
//			if(course.getId() == courseId)
//			{
//				c = course;
//				break ;
//			}
//		}
//	 	
		return repo.getOne(courseId);//it will give all single value as id 
	}

	@Override
	public Course addCourse(Course course) {
		
		repo.save(course);
		//list.add(course);//we add a new course to our list 
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
//		list.forEach(e->{
//			
//			if(e.getId() == course.getId())
//			{
//				e.setTitel(course.getTitel());
//				e.setDesc(course.getDesc());
//			}
	//we traverse through each list value if get id and our course id is same then settitel
			//and get update one like this 
	   //          	});
		
		repo.save(course);//it will update 
		
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		
	//list =this.list.stream().filter(e-> e.getId() != parseLong).collect(Collectors.toList());
		
		 Course entity=repo.getOne(parseLong);//here we load the entity as id given and delete that same entity
		 
		 repo.delete(entity);
	}

}
