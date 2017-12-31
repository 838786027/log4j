package com.cpphot.action;

import org.apache.test.Classlib;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 控制第三方类库输出
 */
public class MainForbid {

	private static final Logger LOGGER=LoggerFactory.getLogger(MainForbid.class);
	
	public static void main(String[] args) {
		LOGGER.info("from MainForbid");
		Classlib.log();
	}

}
