package com.testing;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class JUnitProgram2 {

	 public String message;
	@Test
	public void isValidate() {
//		assertEquals("hello world",message);
		assertNotNull(message);
		
	}
}
