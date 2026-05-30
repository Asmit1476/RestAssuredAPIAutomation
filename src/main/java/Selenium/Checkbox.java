package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Checkbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/men-tshirts");
        WebElement tshirtCheckbox = driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]"));
        tshirtCheckbox.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
}