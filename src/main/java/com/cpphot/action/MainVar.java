package com.cpphot.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 使用变量
 *
 */
public class MainVar {
	static{
		System.setProperty("app_root", "APP_ROOT");
	}
	private static final Logger LOGGER=LoggerFactory.getLogger(MainVar.class);
	public static void main(String[] args) {
		LOGGER.info("test var");
	}
}
