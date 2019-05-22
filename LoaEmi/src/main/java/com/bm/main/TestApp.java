package com.bm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bm.beans.EmiCal;

public class TestApp {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/bm/cfg/Beans.xml");
		
		EmiCal emi=ctx.getBean("emi", EmiCal.class);
		
		double installment=emi.getEmi(500000.00, 3, "Ms");
		
		System.out.println(installment);// brajesh2626@gmail.com 
		//https://github.com/ALOKSINGH-IT/chambletomar.git
	}

}
