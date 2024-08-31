package demo.testng;

import org.testng.annotations.Test;

public class DependenciesManagement {
	
	// Problem-1 Admit student to engineering
	// Problem-2 Admit student to higher secondary
  @Test(enabled=true)
  public void highSchool() {
	  System.out.println("Completed High School");
  }
  
  @Test(dependsOnMethods = "highSchool")
  public void higherSecondary() {
	  System.out.println("Completed Higher Secondary");
  }
  
  @Test(dependsOnMethods ="higherSecondary")
  public void engineering() {
	  System.out.println("Completed Engineering");
  }
}
