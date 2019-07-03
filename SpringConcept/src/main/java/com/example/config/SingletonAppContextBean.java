
package com.example.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.example.bean.PrototypeBean;

@Component
public class SingletonAppContextBean implements ApplicationContextAware {

	ApplicationContext applicationContext;

	public PrototypeBean getPrototypeBean() {
		return applicationContext.getBean(PrototypeBean.class);
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

}
