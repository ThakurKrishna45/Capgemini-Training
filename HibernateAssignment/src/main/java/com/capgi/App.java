package com.capgi;

import com.capgi.dao.StudentDAO;
import com.capgi.dao.StudentDAOImpl;
import com.capgi.entity.Student;

public class App {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAOImpl();

        dao.save(new Student("Krishna Pratap Singh", "CSAI", 21, 85));
        dao.save(new Student("Mayank", "CSAI", 22, 90));
        dao.save(new Student("Anubhav", "CS", 21, 85));

        System.out.println("---- FETCH ALL ----");
        dao.getAllStudent().forEach(System.out::println);

        System.out.println("---- FETCH BY ID ----");
        System.out.println(dao.getStudentById(1));

        System.out.println("---- UPDATE MARKS ----");
        dao.updateMarks(1, 95);

        System.out.println("---- UPDATE MARKS BY NATIVE ----");
        dao.nativeUpdateMarks(2, 91);

        System.out.println("---- SORT BY MARKS ----");
        dao.sortBymarks().forEach(System.out::println);

        System.out.println("---- SORT BY AGE DESC ----");
        dao.sortByAgeDesc().forEach(System.out::println);

        System.out.println("---- FILTER BY DEPT ----");
        dao.filterByDept("CSAI").forEach(System.out::println);

        System.out.println("---- NATIVE FETCH ----");
        dao.nativeFetch().forEach(System.out::println);
    }
}
