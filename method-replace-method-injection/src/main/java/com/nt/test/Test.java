package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mr.model.IText;

public class Test {

	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfg/beans.xml");
		
		IText it=ctx.getBean("itext",IText.class);
		it.generateReport();
		
	}
}
