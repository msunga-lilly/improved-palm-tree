package com.simplejava;

import org.apache.log4j.Logger;
import org.joda.time.LocalDate;

public class App {
	
	private static final Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		System.out.println("Hi there.  Current date is: " + getLocalCurrentDate());
	}

	private static String getLocalCurrentDate() {

		if (logger.isDebugEnabled()) {
			logger.debug("Hi there - getLocalCurrentDate() is executed!");
		}

		LocalDate date = new LocalDate();
		return date.toString();

	}

}
