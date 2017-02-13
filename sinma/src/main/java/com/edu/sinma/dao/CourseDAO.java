package com.edu.sinma.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.edu.sinma.model.Course;

@Repository
@Transactional
public class CourseDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Course create(Course course){
		return entityManager.merge(course);
	}
}
