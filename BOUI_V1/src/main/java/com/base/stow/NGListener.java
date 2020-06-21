package com.base.stow;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class NGListener implements ITestListener {
	

	public void onFinish(ITestContext arg0) {
		System.out.println("On Finish");
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println("On Start");
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("On Test Failed With Success Percentage");
		
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("On Test Failure");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("On Test Skipped");
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("On Test Start");
		
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("On Test Success");
		
	}

	
	

}
