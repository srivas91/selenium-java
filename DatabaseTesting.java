// Week-4 Pgm-1ss
package com.example;

import java.sql.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatabaseTesting {
	@Test
   public void getConnection() throws ClassNotFoundException,SQLException, InterruptedException
   {
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   System.out.println("driver loaded");
	   String DB_URL="jdbc:mysql://localhost:3306/datatest";
	   String DB_USER="root";
	   String DB_PASS="root";
	   
	   Connection con=DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
	   Statement stmt=con.createStatement();
	   ResultSet rs=stmt.executeQuery("select * from users");
	  
	   while(rs.next())
	   {
		   // Set the path of the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "D:\\myeclipse\\chromedriver.exe");

	        // Initialize WebDriver for Chrome browser
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(5000);
	        
	        WebElement userName=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]"));
	        System.out.println("username is"+rs.getString(2));
	        System.out.println("password is"+rs.getString("password"));
	        
	        userName.sendKeys(rs.getString("username"));
	        Thread.sleep(5000);
	        
	        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	        password.sendKeys(rs.getString("password"));
	        Thread.sleep(5000);
	        
	        WebElement login=driver.findElement(By.xpath("//div/button[@type='submit']"));
	        login.click();
	        

	   }
	   stmt.close();
	   con.close();
   }
}
