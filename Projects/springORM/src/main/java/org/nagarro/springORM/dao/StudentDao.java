package org.nagarro.springORM.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.nagarro.springORM.entity.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	@Transactional 
	public int insert(Student student) {
		Integer i =(Integer)hibernateTemplate.save(student);
		return i;
	}
	/**
	 * @return the hibernateTemplate
	 */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//get single object
	public Student getStudent(int id ) {
		Student s =hibernateTemplate.get(Student.class, id);
		return s;
	}
	// all student objects 
	public List<Student> getAllStudent(){
		List<Student> s = hibernateTemplate.loadAll(Student.class);
		return s;
	}
	@Transactional
	public void delete(int id) {
		Student s =hibernateTemplate.get(Student.class, id);
		hibernateTemplate.delete(s);
	}
	@Transactional
	public void update(Student s ) {
		this.hibernateTemplate.update(s);
		
	}
	
	
	
}
