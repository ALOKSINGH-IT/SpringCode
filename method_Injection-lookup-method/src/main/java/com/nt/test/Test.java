package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Tokan;
import com.nt.model.TokanGenareted;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nt/cfg/beans.xml");
		TokanGenareted tg1=ctx.getBean("tg", TokanGenareted.class);
		TokanGenareted tg2=ctx.getBean("tg", TokanGenareted.class);
		System.out.println(tg1.hashCode());
		System.out.println(tg2.hashCode());
	}

}
