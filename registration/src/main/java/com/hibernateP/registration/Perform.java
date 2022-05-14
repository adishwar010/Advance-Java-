package com.hibernateP.registration;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernateP.registration.Student;

public class Perform {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		 //select
		 Session s=factory.openSession();
		 
		 String SelectQuery="from Student";
		 Query q1=s.createQuery(SelectQuery);
		 
		 // Multiple Records
		 
		 List<Student> lst= ((org.hibernate.query.Query) q1).list();
		for(Student em:lst)
		{
			 System.out.println(em.getId()+" "+em.getFname()+" "+em.getSex());
		
	    }
//		 List<employee> lst1= ((org.hibernate.query.Query) q1).list();
//			for(employee em:lst1)
//			{
//				
//			   if(em.getSal()>35000)
//			   {
//				 System.out.println(em.getEid()+" "+em.getName()+" "+em.getDept()+" "+em.getDesignation()+" "+em.getManager()+" "+em.getSal()+" "+em.getTax()+" "+em.getDjoin());
//			   }
//		    
//	}
//		 org.hibernate.Transaction tx= s.beginTransaction();
//        String resultQuery="from employee where sal >250";
//		
//		 
//		 Query q3=s.createQuery(resultQuery);
//		 List<employee> mst= ((org.hibernate.query.Query) q3).list();
//		for(employee em:mst)
//		{
//			 System.out.println(em.getEid()+" "+em.getName());
//		
//	    }
//		 tx.commit();
		
	

}
}

