package com.testing;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class MyTestNG2 {	
	@BeforeClass
	public void preconditions() {
		System.out.println("run preconditions");
	}
//	
	@AfterClass
	public void postconditions() {
		System.out.println("run postconditions");
	}
	
	@Test
	public void test1() {
		System.out.println("test1 executed");
	}
		  
}
