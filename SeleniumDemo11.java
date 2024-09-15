
// Select Radio Button
// Week-2 pgm-4
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo11 {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\myeclipse\\chromedriver.exe");

        // Initialize WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();

        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        Thread.sleep(3000);
        
        WebElement maleRadiobutton = driver.findElement(By.id("radio1"));
        maleRadiobutton.click();
        
        WebElement femaleRadiobutton = driver.findElement(By.id("radio2"));
        femaleRadiobutton.click();
        
        
        System.out.println("male radio button is selected?"+maleRadiobutton.isSelected());
        System.out.println("female radio button is selected?"+femaleRadiobutton.isSelected());
        
        
       
        // Close the browser
        driver.quit();
        
    }
}
