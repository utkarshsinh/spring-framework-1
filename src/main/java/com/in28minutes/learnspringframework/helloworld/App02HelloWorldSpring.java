package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2: Configure the things that we want Spring to manage - 
				//HelloWorldConfiguration - @Configuration
//		Configuration Class is used to launch spring context
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
			//3: Retrieving Beans managed by Spring
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("person2method"));
			
			System.out.println(context.getBean("person3parameter"));
			
			System.out.println(context.getBean("person4parameter"));

			
			System.out.println(context.getBean("address2")); // name of the bean
			
			System.out.println(context.getBean(Address.class)); // type of the bean
			
			for(String p: context.getBeanDefinitionNames()) {
				System.out.println(p);
			}
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}
		
		
	}

}
