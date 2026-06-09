package com.LocatorTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameDemo {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		
		for(WebElement ele: allLinks) {
			System.out.println(ele.isDisplayed());
			System.out.println(ele.isEnabled());
			System.out.println(ele.getAttribute("href"));
		}
			//click on 4th link
			//WebElement ele = allLinks.get(3);
			//ele.click();
		WebElement ele = allLinks.get(3);

		String expectedURL = "https://help.hollandandbarrett.com/hc/en-gb";

		ele.click();
		Thread.sleep(3000);
		String actualURL = driver.getCurrentUrl();

		if (actualURL.equals(expectedURL)) {
		    System.out.println("Navigation successful - correct link");
		} else {
		    System.out.println(" Navigation failed - wrong link");
		}
			
			
		
	}

}
