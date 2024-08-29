// Python Version Search
package resources;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {
    public static void main(String[] args) {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\myeclipse\\chromedriver.exe");

        // Initialize WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.python.org");
        // Print the title of the web page
        System.out.println("Page Title is: " + driver.getTitle());
        
//        WebElement search=driver.findElement(By.name("q"));
        
//        Locate element By Id
        WebElement searchbox=driver.findElement(By.id("id-search-field"));
        searchbox.sendKeys("python 3.12");
        searchbox.sendKeys(Keys.ENTER);
        
        // download python 3.12
//        Locate element By xPath
        WebElement linktext=driver.findElement(By.xpath("//a[contains(text(),'Python 3.12.0rc2')]"));
        linktext.sendKeys(Keys.ENTER);
        
        
        WebElement softlink=driver.findElement(By.xpath("//a[contains(text(),'Windows installer (64-bit)')]"));
        softlink.sendKeys(Keys.ENTER);
        
        // Close the browser
//        driver.quit();
        
    }
}

