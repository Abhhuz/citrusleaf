package com.laalela_api.utility;

import org.apache.log4j.Logger;

public class Log {
	//Initialize Log4j logs
    private static Logger Log = Logger.getLogger(Log.class.getName());
		
	public static void Info(String message) {
		 Log.info(message);
	}
	public static void error(String message) {
		 Log.error(message);
	}
}
