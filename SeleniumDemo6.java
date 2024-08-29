// Jio Recharge Plan Using Selenium

package resources;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo6 {
    public static void main(String[] args) {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\myeclipse\\chromedriver.exe");

        // Initialize WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.meesho.com/");
        // Print the title of the web page
        System.out.println("Page Title is: " + driver.getTitle());
        WebElement search=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        
        // Locate element by name
//        WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
        search.sendKeys("shirt");
        search.sendKeys(Keys.ENTER);
        
        // Locate element by link text
//        WebElement recelem=driver.findElement(By.linkText("Recharge"));
//        recelem.click();
//        WebElement mobnum=driver.findElement(By.xpath("//input[@id='submitNumber']"));
        

        // Close the browser
//        driver.quit();
        
    }
}

