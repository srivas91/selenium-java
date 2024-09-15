
// Select Check Box
// Week-2 pgm-5
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDemo12 {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\myeclipse\\chromedriver.exe");

        // Initialize WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();

        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        Thread.sleep(3000);
        
        WebElement orangeCheckbox = driver.findElement(By.id("checkbox1"));
        orangeCheckbox.click();
        
        WebElement blueCheckbox = driver.findElement(By.id("checkbox2"));
        blueCheckbox.click();
        
        
        System.out.println("orange checkbox is selected?"+orangeCheckbox.isSelected());
        System.out.println("blue checkbox is selected?"+blueCheckbox.isSelected());
        
        
       
        // Close the browser
        driver.quit();
        
    }
}
