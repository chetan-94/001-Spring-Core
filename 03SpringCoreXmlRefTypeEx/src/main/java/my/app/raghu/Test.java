package my.app.raghu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	//ctrl + F11 // ctrl+ Fn + F11
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Service s = (Service) ac.getBean("sob");
		System.out.println(s);
	}
}
