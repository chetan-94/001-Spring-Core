package com.app.raghu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("BEFORE CONTAINER CREATION");
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("AFTER CONTAINER CREATION");
		
		
		System.out.println("TRYING TO READ OBJECT FROM CONTAINER");
		Token ta1  = ac.getBean("t1",Token.class);
		System.out.println(ta1);
		Token ta2  = ac.getBean("t1",Token.class);
		System.out.println(ta2);
	}
}
