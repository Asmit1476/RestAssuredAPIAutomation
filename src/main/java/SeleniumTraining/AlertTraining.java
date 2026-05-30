package SeleniumTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTraining {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","/Users/asmit/Downloads/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        //driver.findElement(By.xpath("//button[@class='btn btn-primary' and @id='alertButton']")).click();
        Thread.sleep(2000);

        //driver.findElement(By.id("confirmButton")).click();
        driver.findElement(By.id("promtButton")).click();

        Alert alert = driver.switchTo().alert();
//        String str = alert.getText();
//        System.out.println("Tittle of the Alert is: "+str);
//        alert.accept();


        Thread.sleep(2000);
        String str = alert.getText();
        System.out.println("Tittle of the Alert is: "+str);
        String input = "Codecraft";
        Thread.sleep(2000);
        alert.sendKeys(input);
        alert.dismiss();


        //alert.dismiss();
        //alert.accept();





       //driver.close();// close only current window
        driver.quit(); // close all the windows/browser and also it will end the session.


    }
}
