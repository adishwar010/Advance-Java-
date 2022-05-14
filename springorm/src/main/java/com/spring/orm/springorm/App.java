package com.spring.orm.springorm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	StudentDao studentDao =context.getBean("StudentDao", StudentDao.class);
    	Student student = new Student(2325,"adi","jammu");
    	int r = studentDao.insert(student);
    	System.out.println("done" + r);
    	Student stud = studentDao.getStudent(2324);
    	System.out.println(stud.getName());
    }
    
}
