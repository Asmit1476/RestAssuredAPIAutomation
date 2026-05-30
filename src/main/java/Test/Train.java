package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Train {
    public static <Stirng> void main(String[] args) throws InterruptedException {
//        String obj = "I am";
//        String[] arrayOfString = obj.split(" ");
//        System.out.println("Length of String " + arrayOfString.length);

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String url = "https://www.imdb.com/?ref_=nv_home";
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(05, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(5000);
       // driver.findElement(By.xpath("//div[@class='ipc-button__text' and text()='EN']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search IMDb']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search IMDb']")).sendKeys("Pushpa");

    }
}

