package demo.testng;

import org.testng.annotations.Test;

public class DriveCar {
  @Test(priority=0)
  public void startCar() {
	  System.out.println("start a car");
  }
  @Test(priority=1)
  public void putFirstGear() {
	  System.out.println("First Gear");
  }
  
  @Test(priority = 2)
  public void putSecondGear() {
	  System.out.println("Second Gear");
  }
  
  @Test(priority=5,enabled = false)   // enabled=false means we can skip this test
  public void playMusic() {
	  System.out.println("Play some Music");
  }
  
  @Test(priority = 3)
  public void putThirdGear() {
	  System.out.println("Third Gear");
  }
  
  @Test(priority = 4)
  public void putFourthGear() {
	  System.out.println("Fourth Gear");
  }
}
