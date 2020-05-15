package com.nisum.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

import com.nisum.beans.Student;

public class NamesapceRunner {

	public static void main(String args[]) {
		ApplicationContext context= new ClassPathXmlApplicationContext("namespace.xml");
		Student student= context.getBean(Student.class);
		System.out.println(student.sNo());
		System.out.println(student.sName());
		System.out.println(student.i);
		
	}

}
