package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();

        WebElement from = driver.findElement(By.id("fromCity"));
        from.click();
        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        actions.moveToElement(from).click().sendKeys("Bang").build().perform();
        //from.sendKeys("Bang");
        Thread.sleep(3000);

        List<WebElement> listOfCity = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//li"));
        System.out.println("List");

        for(WebElement ele:listOfCity){
            String cityName = ele.getText();
            System.out.println(cityName);

            if(cityName.contains("Bangkok, Thailand")){
                System.out.println("My City Name is: "+cityName);

                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
                ele.click();

                Thread.sleep(3000);
                break;
            }
        }
        Thread.sleep(3000);
        driver.quit();
    }
}