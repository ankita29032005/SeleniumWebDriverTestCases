package com.MultipleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleFrameDemo {
	
	@Test
	public void setUp() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Ankita.Rout/Desktop/iframe.html");
		driver.manage().window().maximize();

		int totalnoofframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames:" + totalnoofframes);

		driver.switchTo().frame("Practise Automation");
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		String title = driver.getTitle();
		System.out.println(title);

		driver.navigate().to("file:///C:/Users/Ankita.Rout/Desktop/iframe.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/a")).click();

		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.xpath("//a[@class='nav-link']//span[contains(text(),'Documentation')]")).click();
		Thread.sleep(5000);
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.navigate().to("file:///C:/Users/Ankita.Rout/Desktop/iframe.html");
		driver.switchTo().frame("EasyCalculation");
		driver.navigate().to("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.findElement(By.id("log_email")).sendKeys("Ankita");
		driver.findElement(By.id("log_password")).sendKeys("Ankita@1234");
		driver.findElement(By.xpath("//input[@name='log_submit']")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		Thread.sleep(5000);
		driver.quit();

	}

}
   


