package com.radioButtons;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtons {
	WebDriver driver;
	String url = "https://www.spicejet.com/";

	@BeforeTest
    public void Setup() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();

	}

	 @Test
	 public void RadioButton() throws InterruptedException {
             Thread.sleep(5000);
             driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
             countRadioButtons();
                
              }

	 public void countRadioButtons() {
		 List<WebElement> radioButtons = driver.findElements(By.xpath("//div[@role='radio']"));
           int count = radioButtons.size();
           System.out.println("Total Radio Buttons: " + count);
	}
}
