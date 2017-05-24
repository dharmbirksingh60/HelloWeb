package com.hibernate.model;
import org.hibernate.Session;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Student s = new Student();
        s.setId(1);
        s.setFirstName("DK");
        s.setLastName("Singh");
        s.setSection("MCA");
        session.save(s);
        session.getTransaction().commit();
    }
}