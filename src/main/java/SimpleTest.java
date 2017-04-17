import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by techterr on 17.04.2017.
 */
public class SimpleTest {
    @Test
    public void SearchRozetka (){
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://rozetka.com.ua");

        WebElement serchField = driver.findElement(By.cssSelector(".rz-header-search-input-text"));
        serchField.clear();
        serchField.sendKeys("Asus Notebook");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement searchButton = driver.findElement(By.cssSelector(".btn-link-i"));
        searchButton.click();
    }
}
