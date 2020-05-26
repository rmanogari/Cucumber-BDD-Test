package com.methodstow.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.reusable.library.Base;
import com.reusable.library.PageObjectO2;

import config.ReadPropFile;

public class MethodStowage {
	
	public WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	PageObjectO2 pgObj = new PageObjectO2();
	
	public void loginMLT() throws Exception {
		
		try {
			
			ReadPropFile dataObj = new ReadPropFile();
			driver=Base.getDriver();
			driver.get(dataObj.getMLTUrl());
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(pgObj.userNametxtbx_xpath)));
			driver.findElement(By.xpath(pgObj.userNametxtbx_xpath)).sendKeys(dataObj.getMLTUserName());	
			driver.findElement(By.xpath(pgObj.pwdtxtbx_xpath)).sendKeys(dataObj.getMLTPwd());
			driver.findElement(By.xpath(pgObj.loginbtn_xpath)).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(pgObj.clntSlctnPepsi_xpath)));
			driver.findElement(By.xpath(pgObj.clntSlctnPepsi_xpath)).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(pgObj.fileUploadicon_id)));
			
			
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
			System.out.println("Not able to login into MLT application");
		}
		
		
	}

}
