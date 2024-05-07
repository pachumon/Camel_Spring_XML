package com.pachumon.hellogradle;

import org.apache.camel.builder.RouteBuilder;

public class TestRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		from("timer:foo?period=5s")
		.log("this is incoming log from timer");
	}

}
