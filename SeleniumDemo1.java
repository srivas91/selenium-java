// Google Search Using Selenium

package resources;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 {
    public static void main(String[] args) {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\myeclipse\\chromedriver.exe");

        // Initialize WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.google.com");
        // Print the title of the web page
        System.out.println("Page Title is: " + driver.getTitle());
        
        // Locate element by name
        WebElement search=driver.findElement(By.name("q"));
        
        search.sendKeys("who is current chief minister of tamilnadu");
        search.sendKeys(Keys.ENTER);
        // Close the browser
//        driver.quit();
        
    }
}

