package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	
	

	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	//save 
	@Transactional
	public int insert(Student student) {
		Integer i =(Integer)this.hibernateTemplate.save(student);
		return i;
	}
	
	public Student getStudent(int id) {
		Student student = (Student)this.hibernateTemplate.get(Student.class, id);
		return student;
	}
	
	public List<Student> getStudents(){
		return this.hibernateTemplate.loadAll(Student.class);
	}
	
	@Transactional
	public void delete(int id) {
		Student student= (Student)this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
	}
	
	@Transactional
	public void update(Student student) {
		this.hibernateTemplate.update(student);
	}
}
