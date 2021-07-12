package com.rudra.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MySpringBean implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

	private String message;

	public void sendMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware.setBeanName()...");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextAware.setApplicationContext()...");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("@PostConstruct...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean.afterPropertiesSet()...");
	}

	public void initMethod() {
		System.out.println("@Bean configuration - initMethod()...");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("@PreDestroy...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean.destroy()...");
	}

	public void destroyMethod() {
        System.out.println("@Bean configuration - destroyMethod()...");
    }
}
