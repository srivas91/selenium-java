// Select DropDown Item
// Week-2 pgm-2
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo9 {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\myeclipse\\chromedriver.exe");

        // Initialize WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();

        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        Thread.sleep(3000);
        
        WebElement dropdown=driver.findElement(By.id("drop1"));
        
        Select select=new Select(dropdown);
        
        select.selectByVisibleText("doc 3");
        
        // Close the browser
        driver.quit();
        
    }
}
