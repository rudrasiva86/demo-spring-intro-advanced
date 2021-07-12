package com.rudra.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		MySpringBean bean = ctx.getBean(MySpringBean.class);
		System.out.println(bean);
		ctx.close();
	}
}
