package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Map;

public class RunTestOnExistingChromeSession2 {
    public static void main(String[] args) {
        //Below line of code will give the port of the chrome browser
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        Capabilities cap = driver.getCapabilities();
        Map<String,Object> myCap = cap.asMap();
        System.out.println(myCap);
    }
}