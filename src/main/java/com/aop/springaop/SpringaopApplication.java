package com.aop.springaop;

import com.aop.springaop.business.Business1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringaopApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringaopApplication.class, args);

		Business1 b1 = (Business1)applicationContext.getBean("business1");
		b1.calculate();
	}

}
