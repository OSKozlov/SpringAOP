package ru.javabegin.training.spring.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.aop.objects.SomeService;

public class Start {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeService service = (SomeService) context.getBean("someService");
		double value = service.getDoubleValue();
		double value2 = 0;
		service.calculate(value, value2);
	}

}
