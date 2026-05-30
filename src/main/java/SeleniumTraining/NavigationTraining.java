package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTraining {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/asmit/Downloads/chromedriver");

        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();

        Thread.sleep(1000);

        driver.navigate().back();
        System.out.println("Back clicked");
        Thread.sleep(1000);
        driver.navigate().forward();
        System.out.println("Forward clicked");

        Thread.sleep(1000);
        driver.navigate().refresh();



    }

}
