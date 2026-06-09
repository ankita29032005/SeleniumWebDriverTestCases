package com.LocatorTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGMethods {
	WebDriver driver;
	String url ="https://practicetestautomation.com/practice-test-login/";
  @BeforeTest
 
  public void Setup() {
	  driver= new ChromeDriver();
	  driver.navigate().to(url);
	  driver.manage().window().maximize();
	  
	  
	  
	 
 }
  @Test
  public void LocatorTest() {
	  driver.findElement(By.name("username")).sendKeys("student");
	  driver.findElement(By.name("password")).sendKeys("Password123");
		
	  driver.findElement(By.xpath("//button[@id='submit']")).click();
	  
  }
  @AfterTest
  public void TestDown() {
	  //driver.quit();
	  
  }
}
