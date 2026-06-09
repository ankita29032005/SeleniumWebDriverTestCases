package com.LocatorTestDemo;
//write a program using selenium web driver, count and print number of links in holland and barret application
//use testNG framework

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkTestDemo {
	WebDriver driver;
	int Total=0;
	@BeforeTest
	public void linkTest() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.navigate().to("https://www.hollandandbarrett.com/");
	  

	}
	@Test
	public void findElementById() throws Exception{
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		//Thread.sleep(20000);
		driver.findElement(By.linkText("Vitamins & Supplements")).click();
		
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkCount = links.size();
		Total=Total+links.size();
		
		System.out.println("Number of Links: "+ linkCount);
		for(int i=1;i<links.size();i++) {
			System.out.println(links.get(i).getText());
		}
	}
	@AfterTest
	  public void TestDown() {
		  driver.quit();
		  
	  }
}
