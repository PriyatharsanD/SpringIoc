package com.priya;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Student getStudent()
	{
		return new Student();
	}
	@Bean
	public Laptop getHp()
	{
		return new Hp();
	}
	@Bean
	public String getString()
	{
		return new String("Hello");
	}
}
