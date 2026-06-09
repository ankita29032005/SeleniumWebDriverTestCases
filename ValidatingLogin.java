package com.LocatorsCaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidatingLogin {
	WebDriver driver;
	String url ="https://practicetestautomation.com/practice-test-login/";
  @BeforeTest
 
  public void Setup() {
	  driver= new ChromeDriver();
	  driver.navigate().to(url);
	  driver.manage().window().maximize();
	  
	  
	  
	 
 }
  @Test
  public void LocatorTest() throws InterruptedException {
	  driver.findElement(By.name("username")).sendKeys("student");
	  driver.findElement(By.name("password")).sendKeys("Password123");
		
	  driver.findElement(By.xpath("//button[@id='submit']")).click();
	   Thread.sleep(4000);
	  

      String actualText = driver.findElement(By.tagName("h1")).getText();
      String expectedText = "Logged In Successfully";
    
     if(actualText.equals(expectedText)) {
        System.out.println("Test Passed: Logged in successfully");
     } else {
        System.out.println("Test Failed");
    }

	  
  }
  @AfterTest
  public void TestDown() {
	  driver.quit();
	  
  }

}
