package com.example.bean;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
	
	/*
	 * @Autowired private PrototypeBean prototypeBean;
	 */
	
	public SingletonBean() {
		System.out.println("Singleton Instance created");
	}

	@Lookup
	public PrototypeBean getPrototypeBean() {
		System.out.println(String.valueOf(LocalTime.now()));
		return null;
	}

	/*
	 * public void setPrototypeBean(PrototypeBean prototypeBean) {
	 * this.prototypeBean = prototypeBean; }
	 */
	
	
}
