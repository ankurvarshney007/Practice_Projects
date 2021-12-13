package org.nagarro.constructor;




import org.nagarro.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext app= new ClassPathXmlApplicationContext("org/nagarro/constructor/rconfig.xml");
       // Student stud =(Student)app.getBean("student1");
        //System.out.println(stud);
       // Student stud1 =(Student)app.getBean("student2");
        //System.out.println(stud1);
        Person emp =(Person)app.getBean("person");
        System.out.println(emp);
    }
}
