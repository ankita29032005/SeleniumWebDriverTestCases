package com.ActionCommandDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpDown3 {
	WebDriver driver;
	String url = "https://www.easycalculation.com/";
	
	@Test
	public void Test() throws Exception{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(10000);
		
		((JavascriptExecutor) driver).executeScript("scroll(0,6600)");
		Thread.sleep(6000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200)", " ");
		
		
		
	}


}
