// Write a program using Selenium WebDriver perform operation using Actions,
// also count and print number of links and images present in Training page

package com.ActionCommandDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class nopcommerceActionTestCase {

    List<WebElement> links;
    List<WebElement> images;

    @Test
    public void Setup() throws Exception {

        WebDriver driver = new ChromeDriver();

  
        driver.navigate().to("https://www.nopcommerce.com/");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        WebElement menu = driver.findElement(By.xpath("//span[normalize-space()='Support & services']"));
        act.moveToElement(menu).perform();

        WebElement training = driver.findElement(By.xpath("//span[normalize-space()='Training']"));
        training.click();

        Thread.sleep(3000);

      
        links = driver.findElements(By.tagName("a"));
        System.out.println("Number of links: " + links.size());

        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i).getText());
        }

      
        images = driver.findElements(By.tagName("img"));
        System.out.println("Number of images: " + images.size());

  
        System.out.println("Current URL: " + driver.getCurrentUrl());

        Thread.sleep(5000);
        driver.quit();
    }
}