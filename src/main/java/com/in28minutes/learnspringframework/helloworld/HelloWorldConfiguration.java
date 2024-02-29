package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {}
record Address(String firstLine, String city) {}
@Configuration
public class HelloWorldConfiguration {
	
	@Bean	
	public String name() {
		return "Utkarsh";
	}
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Ravi", 20, new Address("Middleton Farm Ln", "Herndon") );		
	}
	
//	Calling bean method dierectly
	@Bean
	public Person person2method() {
		return new Person(name(), age(), address() );		
	}
	
	@Bean
	public Person person3parameter(String name, int age, @Qualifier("addressqualify") Address address) {
		return new Person(name, age, address);		
	}
	
	@Bean
	public Person person4parameter(String name, int age, Address address) {
		return new Person(name, age, address);		
	}
//	 To resolve between two conflicting class objects

	@Bean(name = "address2")
	
	public Address address() {
		return new Address("Baker Street", "London");		
	}
	
	@Bean(name = "address3")
	@Primary
	@Qualifier("addressqualify")
	public Address address1() {
		return new Address("Mahangar", "Lucknow");		
	}
	

}
