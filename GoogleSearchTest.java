package com.example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		 // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\myeclipse\\chromedriver.exe");

        // Initialize WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();

       
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        // Open a website
        driver.get("https://www.google.com");
        driver.findElement(By.id("APjFqb")).sendKeys("testing");
        List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='wM6W7d']"));
        System.out.println("total no.of suggestions in search box:"+list.size());
        for(int i=0;i<list.size();i++)
        {
        	System.out.println(list.get(i).getText());
        }
        
        

	}

}
