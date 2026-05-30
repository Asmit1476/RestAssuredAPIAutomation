package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTutorial {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","/Users/asmit/Downloads/chromedriver");
        driver = new ChromeDriver();

        driver.navigate().to("https://amazon.com/");

        driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
        WebElement ele= driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
        ele.click();


        Thread.sleep(1000);
        driver.navigate().back();


        Thread.sleep(1000);
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.quit();

    }
}
