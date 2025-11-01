package com.AutomationFramework.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Generic {

	
	public static String currentDateAndTime() {
		LocalDateTime myDate = LocalDateTime.now();
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
		
		String formattedDate = myDate.format(myFormat);
		return formattedDate;
	}
	
	
}
