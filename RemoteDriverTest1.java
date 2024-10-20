package com.testing;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoteDriverTest1 {

	 private WebDriver driver;
	  DesiredCapabilities desc;
	 
	   @Parameters({"browserName"})
	   @BeforeClass
	   @Test
	   public void test1(String browserName) throws Exception
	  {
//	      WebDriverManager.chromedriver().setup();
	      switch(browserName)
	     {
	          case "firefox":
	        	 WebDriverManager.firefoxdriver().setup();
	             desc=DesiredCapabilities.firefox();
	            break;
	          
	          case "chrome":
	             WebDriverManager.chromedriver().setup();
	             desc=DesiredCapabilities.chrome();
	            break;
	          default:
	               System.out.println("Pass valid value of browser");
	    }
	      driver=new RemoteWebDriver(new URL("http://192.168.0.109:4444/wd/hub"),desc);
	      driver.navigate().to("https://www.facebook.com/");
	      driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
	      driver.quit();
	  }

}
