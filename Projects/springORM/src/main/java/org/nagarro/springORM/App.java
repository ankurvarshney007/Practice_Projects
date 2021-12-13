package org.nagarro.springORM;

import org.nagarro.springORM.dao.StudentDao;
import org.nagarro.springORM.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
       StudentDao stud=con.getBean("studentDao",StudentDao.class);
       Student s = new Student();
       s.setCity("Lucknow");
       s.setId(1);
       s.setName("Himanshi");
       //int res =stud.insert(s);
       //System.out.println("done " + res);
       stud.update(s);
       System.out.println(stud.getStudent(1));
    }
}
