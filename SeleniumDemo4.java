// Jio Mart Search

package resources;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class SeleniumDemo4 {
    public static void main(String[] args) {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\myeclipse\\chromedriver.exe");

        // Initialize WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();

        String webURL="https://www.meesho.com/";
        // Open a website
        driver.get(webURL);
        // Print the title of the web page
        System.out.println("Page Title is: " + driver.getTitle());
        
//        WebElement search=driver.findElement(By.name("q"));
        
//        Locate element By absolute xpath
        WebElement searchbox=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        searchbox.sendKeys("shirt");
        searchbox.sendKeys(Keys.ENTER);
        
//        Locate element By relative XPath
        
          driver.findElement(By.xpath("//body/div[@id='__next']/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")).click();
//          iteminfo.sendKeys(Keys.ENTER);
//        System.out.println(itemprice.getText());
       

        // Close the browser
//        driver.quit();
        
        
    }
}

