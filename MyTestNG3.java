package com.testing;

import org.testng.annotations.Test;

public class MyTestNG3 {
  
	@Test(priority = 0)
   public void highSchool() {
	   System.out.println("high school completed");
   }
   
   @Test(priority = 2)
   public void graduate() {
	   System.out.println("graduate completed");
   }
   
   @Test(priority = 1)
   public void higherSecondary() {
	   System.out.println("higher secondary completed");
   }
}
