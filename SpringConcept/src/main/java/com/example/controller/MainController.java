package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.PrototypeBean;
import com.example.bean.SingletonBean;
import com.example.config.SingletonAppContextBean;

@RestController
public class MainController {
	
	@Autowired
	SingletonAppContextBean context;
	
	@Autowired
	ApplicationContext applicationContext;
	
	@GetMapping("/test")
	public String test() {
		return context.getPrototypeBean().toString();
	}
	
	@GetMapping("/appcontext")
	public String appcontext() {
		return applicationContext.getBean(PrototypeBean.class).toString();
	}
	
	/*
	 * @GetMapping("/singleton") public String singleton() { SingletonBean sb =
	 * applicationContext.getBean(SingletonBean.class); PrototypeBean pb =
	 * applicationContext.getBean(PrototypeBean.class); sb.setPrototypeBean(pb);
	 * return sb+" "+sb.getPrototypeBean(); }
	 */
	
	@GetMapping("/lookup")
	public String lookup() {
		SingletonBean sb = applicationContext.getBean(SingletonBean.class);
		return sb+" "+sb.getPrototypeBean();
	}
	
}
