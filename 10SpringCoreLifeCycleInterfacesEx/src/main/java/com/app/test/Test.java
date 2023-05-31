package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ac2 = new AnnotationConfigApplicationContext();
		ApplicationContext ac1 = new ClassPathXmlApplicationContext(new String[] {"config1.xml","config2.xml"},ac2);
	}
	
	public static void main2(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		Object ob = ac.getBean("eobj");
		System.out.println(ob);
		ac.close();
	}

	public static void main1(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Object ob = ac.getBean("eobj");
		System.out.println(ob);
		ac.close();
	}
}
