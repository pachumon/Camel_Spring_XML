/**
 * 
 */
package com.pachumon;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 */
public class FileProcessor implements Processor {
	private static final Logger LOGGER = LoggerFactory.getLogger(FileProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("entering the processor flow");
		throw new IllegalArgumentException("An exception happened on purpose");
//		String originalFileContent = (String) exchange.getIn().getBody(String.class);
//        String upperCaseFileContent = originalFileContent.toUpperCase();
//        exchange.getIn().setBody(upperCaseFileContent);
	}

}