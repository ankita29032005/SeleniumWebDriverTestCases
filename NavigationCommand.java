package com.navigationTestDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommand {
	@Test(priority=0)
	public void navigationToMethod() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/"); 
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.quit();
		
		
		
	}
	@Test(priority=1)
	public void navigationBackDemo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/"); 
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
		driver.navigate().to("https://login.yahoo.com/");
		URL= driver.getCurrentUrl();
		System.out.println(URL);
		//driver.quit();
		
		
		
	}
	@Test(priority =2)
	public void refreshBack() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://login.yahoo.com/");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().refresh();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
		driver.navigate().refresh();
		URL= driver.getCurrentUrl();
		System.out.println(URL);
		//driver.quit();
		
	}
	@Test(priority=3)
	public void navigateForward() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/"); 
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.navigate().to("https://login.yahoo.com/");
		URL= driver.getCurrentUrl();
		System.out.println(URL);
		
		
		
		driver.navigate().back();
		URL= driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().forward();
		URL= driver.getCurrentUrl();
		System.out.println(URL);
		
		
		
		
	}

}
