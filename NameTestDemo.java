package com.LocatorTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NameTestDemo {
	WebDriver driver;
	String url ="https://practicetestautomation.com/practice-test-login/";
	@Test
	public void NameLocator() {
		//WebDriver driver = new ChromeDriver();
		driver= new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		
		//driver.findElement(By.xpath("//button[@id='submit']")).click();
		driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
		
		String title= driver.getTitle();
		System.out.println(title);
		
	}

}
