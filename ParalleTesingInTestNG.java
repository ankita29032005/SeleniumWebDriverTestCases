package com.ParalleltestingInTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class ParalleTesingInTestNG {
	WebDriver driver;
	String url = "https://www.login.hiox.com/register?referrer=easycalculation.com";
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {

	      System.out.println("Browser name is..... " + browserName);

	      if (browserName.equalsIgnoreCase("Chrome")) {
	              driver = new ChromeDriver();

	    } else if (browserName.equalsIgnoreCase("Firefox")) {
	              driver = new FirefoxDriver();

	    } else if (browserName.equalsIgnoreCase("Edge")) {
	    	     driver = new EdgeDriver();
	    }
	              
	    }
	@Test
	public void BrowserTest() throws Exception {

		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
       }
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
