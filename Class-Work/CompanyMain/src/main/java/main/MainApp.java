package main;

import Entity.Person;

public class MainApp {
    public static void main(String[] args) {
        Person p=new Person();
        p.setId(45);
        p.setName("Rohit");
        System.out.println(p);
    }
}
