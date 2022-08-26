package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        HelloWorld h = (HelloWorld)context.getBean("obj");
        h.print();
        
        Student s = (Student) context.getBean("s1");
        System.out.println("ID: " + s.getId() + "\nName: " + s.getName());

        Marks m = (Marks) context.getBean("m1");
        
        System.out.println("Physics: "+m.getPhysics());
        System.out.println("Chemistry: "+m.getChemistry());
        System.out.println("Mathematics: "+m.getMaths());
        
    }
}
