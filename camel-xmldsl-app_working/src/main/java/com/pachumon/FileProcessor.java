/**
 * 
 */
package com.pachumon;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * 
 */
public class FileProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		String originalFileContent = (String) exchange.getIn().getBody(String.class);
        String upperCaseFileContent = originalFileContent.toUpperCase();
        exchange.getIn().setBody(upperCaseFileContent);
	}

}