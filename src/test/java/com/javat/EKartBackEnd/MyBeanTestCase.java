package com.javat.EKartBackEnd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javat.EKartBackend.MyBean;

public class MyBeanTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---Test Case - AnnotationConfigApplication Context Object Created---");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.MobitelBackend");
		
		context.refresh();
		
		System.out.println("---My Bean Created---");
		
		MyBean myBean=(MyBean)context.getBean("myBean");
		
		myBean.display();
	}

}
