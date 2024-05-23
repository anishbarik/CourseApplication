package com.RestfulApi.Course.Application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RestfulApi.Course.Application.entity.Course;

public interface CourseSpringJpaRepo extends JpaRepository<Course, Long> {
	
//we use this to talk with database we just extend jpaRepository class 
/*
 why we use repository class in spring boot?
1) Repository is the annotation that is required to perform actions on the object.
 2) We can use crud repository or JPA repository to perform any operations like add, 
 delete, save, find etc. 3) it is a specialization to @componant in spring boot.
 */
}
