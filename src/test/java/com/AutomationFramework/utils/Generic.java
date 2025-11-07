package com.AutomationFramework.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic {

	
	public static String currentDateAndTime() {
		LocalDateTime myDate = LocalDateTime.now();
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
		
		String formattedDate = myDate.format(myFormat);
		return formattedDate;
	}
	
	public static void getScreenShot(WebDriver driver,String methodName, String dateAndTime) {
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("./ScreenShots/"+methodName+dateAndTime+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Object readProperties(String file, String key) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.get(key);
	}
	
	/*public static void main(String args[]) {
		System.out.println(readProperties(System.getProperty("user.dir")+"\\props\\credentials.properties", "password"));
	}*/
}
