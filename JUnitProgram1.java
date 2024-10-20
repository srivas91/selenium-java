package com.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// junit-5 program

public class JUnitProgram1 {
    @BeforeAll
    public static void preClass() {
System.out.println("@BeforeAll – the annotated method runs once before all other methods execute");
}
    @BeforeEach
    public void setUp() { 
    System.out.println("_______________________________________________________\n");
System.out.println("@BeforeEach – the annotated method executes before each test ");
    }
    @Test
    public void test_JUnit1() {
        System.out.println("@Test – this is test case 1");
    }
    @Test
    public void test_JUnit2() {
        System.out.println("@Test – this is test case 2");
    }
    @Test
    public void test_JUnit3() {
        System.out.println("@Test – this is test case 3");
 
    }
    @AfterEach
    public void tearDown() {
System.out.println("@AfterEach – the annotated method executes after each test executes");
    System.out.println("_______________________________________________________\n");
    }
 
 @AfterAll
    public static void postClass() {
System.out.println("@AfterAll – the annotated method runs once after all other methods execute");
}
}
