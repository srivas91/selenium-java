package com.example;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\myeclipse\\chromedriver.exe");

        // Initialize WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();

       
        driver.manage().window().maximize();
        
        File file = new File("D:\\myanimals.html");
        String filePath = "file:///" + file.getAbsolutePath();
        driver.get(filePath);
        // descendant node
        List<WebElement> list=driver.findElements(By.xpath("//div[@class='Mammal']/child::div"));
        System.out.println("total no.of suggestions in search box:"+list.size());
        System.out.println("list is"+list);
        for(WebElement w:list)
        {
        	System.out.println(w.getText());
        }
//        for(int i=0;i<list.size();i++)
//        {
//        	if(list.get(i).getText().contains("Mammal"))
//        	{
//        	System.out.println(list.get(i).getText());
//        	break;
//        	}
//        }

	}

}
