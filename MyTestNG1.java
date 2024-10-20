package com.testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestNG1 {

	  @BeforeTest
	  public void setup() {
		  System.out.println("database driver installed");
	  }
	  
	  @AfterTest
	  public void destroy() {
		  System.out.println("close database connection");
	  }
	  
	  @Test
	  public void connect() {
		  System.out.println("connecting to the database");
	  }
	  
}
	