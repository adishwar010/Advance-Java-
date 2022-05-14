package com.hib.demo;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hib.demo.*;
public class App
{
public static void main( String[] args )
{
System.out.println( "Hello World!" );
SessionFactory factory=new Configuration().configure().buildSessionFactory();
System.out.println(factory);
Student st=new Student();
st.setId(38);
st.setName("NILESH");
st.setCity("SATARA");

//create object of Address class.....
Address ad=new Address();
ad.setDistrict("SATARA");
ad.setLandmarks("RAJWADA");
ad.setPermanent(true);
ad.setStreet("Gandi_Road");
ad.setPincode("415001");
ad.setAddeddate(new Date());

System.out.println(st);
Session session=factory.openSession();
session.beginTransaction();
session.save(st);
session.save(ad);
session.getTransaction().commit();
session.close();
}
}
