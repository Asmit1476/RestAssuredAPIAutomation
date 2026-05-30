package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Map;

public class RunTestOnExistingChromeSession {
    // Chrome Path = cd C:\Program Files\Google\Chrome\Application (cd to this chrome path in command prompt after that run the below script)
    //command prompt script = chrome.exe --remote-debugging-port=9111 --user-data-dir=C:\Users\AsmitAnand\Desktop\chromeData
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AsmitAnand\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //or use below commented line for chromedriver
        //WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress","localhost:9112");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.makemytrip.com/");
    }
}