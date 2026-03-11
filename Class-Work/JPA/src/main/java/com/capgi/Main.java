package com.capgi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();

//        -------------------------SAVE-------------------------------

//        Student s1=new Student();
//        s1.setId(111);
//        s1.setName("Alice");
//        s1.setAge(21);
//        s1.setDept("CSAI");
//        s1.setMarks(97);
//
//        Student s2=new Student();
//        s2.setId(112);
//        s2.setName("BOB");
//        s2.setAge(24);
//        s2.setDept("IT");
//        s2.setMarks(61);
//        entityManager.persist(s1);
//        entityManager.persist(s2);
//        entityTransaction.commit();

//-------------------------------FETCH--------------------------------

//        Student student= entityManager.find(Student.class,111);
//        System.out.println(student);
//        List<Student> list= entityManager.createQuery("from Student",Student.class).getResultList();
//        for(Student s: list){
//            System.out.println(s);
//        }

//        --------------------------UPDATE---------------------------
        Student student1=entityManager.find(Student.class,111);
        student1.setAge(23);
        entityManager.merge(student1);
        entityTransaction.commit();

//        -----------------------------DELETE----------------------------------
        Student student=entityManager.find(Student.class,111);
        entityManager.remove(student);
        entityTransaction.commit();
    }
}
