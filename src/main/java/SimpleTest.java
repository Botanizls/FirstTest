import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by techterr on 17.04.2017.
 */
public class SimpleTest {

   public static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\Soft\\WebDriver\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterClass
    public static void closeChrome(){
        driver.quit();
    }
    @Test
    public void searchGoogle (){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://google.com/ncr");
        driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
        assertTrue(driver.findElement(By.cssSelector(".srg .g:nth-child(1)")).getText().contains("Selenium"));
    }

}
