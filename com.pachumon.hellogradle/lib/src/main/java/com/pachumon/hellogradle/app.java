package com.pachumon.hellogradle;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class app {

	public static void main(String[] args) throws Exception{
		CamelContext context= new DefaultCamelContext();
		
		context.addRoutes(new TestRoute());
		
		while (true) {
			context.start();
		}	
		
	}

}
