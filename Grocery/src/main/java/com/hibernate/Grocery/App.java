package com.hibernate.Grocery;

//import java.lang.invoke.ClassSpecializer.Factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory s = new Configuration().configure().buildSessionFactory();
        
        Product p = new Product();
        p.setPname("Bandgobi");
        p.setCategory("Goon");
        p.setPrice(200);
        
        Session session = s.openSession();
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
        session.close();
    }
}
