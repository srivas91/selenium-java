
// Select Table
// Week-2 pgm-6
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDemo13 {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\myeclipse\\chromedriver.exe");

        // Initialize WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();

        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        Thread.sleep(3000);
        
        WebElement table=driver.findElement(By.id("table1"));
        List<WebElement> headers=driver.findElements(By.tagName("th"));
        for(WebElement header:headers)
        {
        System.out.println("table heading:"+header.getText());
        }
        List<WebElement> allrows=table.findElements(By.cssSelector("tbody tr"));
        int i=0;
        for(WebElement row:allrows)
        {
        	i++;
        	System.out.println("row-"+i+"-"+row.getText());
        }
        // Close the browser
        driver.quit();
        
    }
}
