package SeleniumTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver;

        System.setProperty("webdriver.chrome.driver","/Users/asmit/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        //accept and getText
        driver.findElement(By.xpath("//button[@class='btn btn-primary' and @id='alertButton']")).click();
        Thread.sleep(20000);
        Alert alert = driver.switchTo().alert();
        String str = alert.getText();
        System.out.println("Text is: "+str);
        alert.accept();


        //dismiss
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(20000);
        Alert alert1 = driver.switchTo().alert();
        alert1.dismiss();

        //sendkeys
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(10000);
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("Testing this");
        Thread.sleep(20000);
        alert2.accept();

//scrolling webpage
//        System.setProperty("webdriver.chrome.driver","/Users/asmit/Downloads/chromedriver");
//        driver = new ChromeDriver();
//        driver.get("https://www.amazon.com/");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        driver.manage().window().maximize();
//        js.executeScript("window.scrollBy(0,1000)","");





        //driver.close();
    }

}
