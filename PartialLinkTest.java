package com.LocatorTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PartialLinkTest {
	WebDriver driver;

	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void linkTest() {
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		
		driver.findElement(By.partialLinkText("Supplements")).click();
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int nolinks = links.size();
		System.out.println("Number of links: " + nolinks);

		for (int i = 1; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
			String str = links.get(i).getText();
			String str1 = "Supplements";

			if (str == str1) {
				driver.findElement(By.linkText("Supplements")).click();
				driver.findElement(By.xpath("//a[contains(@type,'button')])[4]")).click();

			}

		}

	}

	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}