package org.nagarro.collections;

import org.nagarro.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext app = new ClassPathXmlApplicationContext("org/nagarro/collections/cconfig.xml");
		// Student stud =(Student)app.getBean("student1");
		// System.out.println(stud);
		// Student stud1 =(Student)app.getBean("student2");
		// System.out.println(stud1);
		Emp emp = (Emp) app.getBean("Emp1");
		System.out.println(emp);
	}
}
