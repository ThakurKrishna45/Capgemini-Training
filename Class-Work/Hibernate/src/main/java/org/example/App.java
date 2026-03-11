package org.example;

import Entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person p=new Person();
        p.setId(18);
//        p.setName("Dho");
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Person.class);
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
//        session.persist(p);
        p.setName("ViratD");
        session.merge(p);
//        Person pr=session.get(Person.class,07);
//        session.remove(pr);
//        List<Person> list=session.createQuery("from Person",Person.class).list();
//        System.out.println("All persons "+list);
//        transaction.commit();
        session.close();
    }
}
