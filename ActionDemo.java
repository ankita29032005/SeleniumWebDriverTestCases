//write a program using selenium webdriver perform operation using actions,alsp count 
//and print number of links present in download page
package com.ActionCommandDemo;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionDemo {
	int linkCount;
	List<WebElement> list;
	@Test
	  public void Setup() throws Exception{
	       WebDriver driver= new ChromeDriver();
	       driver.navigate().to("https://www.easycalculation.com/#");
	       driver.manage().window().maximize();
	       
	       WebElement ele = driver.findElement((By.xpath("//a[@href='#']")));
	       Actions act = new Actions(driver);
	       act.moveToElement(ele).build().perform();
	       
	       list = driver.findElements(By.tagName("a"));
	       System.out.println("Number of a links-" + list.size());
	       
	       for(int i=0;i<list.size();i++) {
	    	   System.out.println(list.get(i).getText());
	    	   
	       }
	       Thread.sleep(6000);
	       WebElement ele2 = driver.findElement(By.xpath("//a[normalize-space()='Download']"));
	       
	       System.out.println(driver.getCurrentUrl());
	       driver.quit();
	       
	       
	       
	}

}
