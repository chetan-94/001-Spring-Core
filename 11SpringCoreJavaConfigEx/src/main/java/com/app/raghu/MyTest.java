package com.app.raghu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		Object ob = ac.getBean("conObj");
		System.out.println(ob);
		
	}
}
