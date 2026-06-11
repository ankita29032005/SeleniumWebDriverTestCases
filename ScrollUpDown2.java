package com.ActionCommandDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpDown2 {
	WebDriver driver;
	String url = "https://www.hollandandbarrett.com/";
	
	@Test
	public void Test() throws Exception{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(10000);
		
		((JavascriptExecutor) driver).executeScript("scroll(0,4000)");
		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200)", " ");
		
		
		
	}

}
