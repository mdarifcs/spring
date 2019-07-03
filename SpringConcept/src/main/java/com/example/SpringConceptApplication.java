package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConceptApplication {

	public static void main(String[] args) {
		//ApplicationContext context = SpringApplication.run(SpringConceptApplication.class, args);
		SpringApplication.run(SpringConceptApplication.class, args);
		/*
		 * System.out.println("First time instance created");
		 * System.out.println("singletonBean " + context.getBean(SingletonBean.class));
		 * System.out.println("prototypeBean " +
		 * context.getBean(SingletonBean.class).getPrototypeBean());
		 * 
		 * System.out.println("\n\nSecond time instance created");
		 * System.out.println("singletonBean " + context.getBean(SingletonBean.class));
		 * System.out.println("prototypeBean " +
		 * context.getBean(SingletonBean.class).getPrototypeBean());
		 */
		
	}

}
