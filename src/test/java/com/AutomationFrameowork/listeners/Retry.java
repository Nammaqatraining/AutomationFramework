package com.AutomationFrameowork.listeners;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer 	{

	private int retryCount = 0;
	private static final int MAX_RETRY_COUNT = 4;
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retryCount < MAX_RETRY_COUNT) {
			retryCount++;
			System.out.println("Retrying the failed test case "+result.getMethod().getMethodName()+" Retry count "+retryCount +" with "+getResultStatusName(result.getStatus()));
			return true;
		}
		return false;
	}

	public String getResultStatusName(int status) {
		String result = null;
		if(status ==1) {
			result = "SUCCESS";
		}
		if(status ==2) {
			result = "FAILURE";
		}
		if(status ==3) {
			result = "SKIP";
		}
		return result;
	}
	
}
