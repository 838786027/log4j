package org.apache.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Classlib {
	private static final Logger LOGGER=LoggerFactory.getLogger(Classlib.class);
	public static void log(){
		LOGGER.info("from classlib");
	}
}
