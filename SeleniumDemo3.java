// Jio Mart Search

package resources;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class SeleniumDemo3 {
    public static void main(String[] args) {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\myeclipse\\chromedriver.exe");

        // Initialize WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();

        String webURL="https://www.jiomart.com";
        // Open a website
        driver.get(webURL);
        // Print the title of the web page
        System.out.println("Page Title is: " + driver.getTitle());
        
//        WebElement search=driver.findElement(By.name("q"));
        
//        Locate element By CSS class
        WebElement searchbox=driver.findElement(By.className("search_input"));
        searchbox.sendKeys("apple iphone 13");
        searchbox.sendKeys(Keys.ENTER);
        
//        Locate element By relative XPath
//        String relxpath="//span[contains(text(),'₹420.00')]";
//        WebElement itemprice=driver.findElement(By.className("plp-card-details-price"));
//        System.out.println(itemprice.getText());
        
        List<WebElement> elements = driver.findElements(By.cssSelector(".plp-card-details-price"));
        System.out.println(elements);

        // Close the browser
//        driver.quit();
        
        
    }
}

