package com.pachumon;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainloader {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = 
				  new ClassPathXmlApplicationContext("application-context.xml");
	}

}
