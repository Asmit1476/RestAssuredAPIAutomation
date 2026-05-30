package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class VymoTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://staging.lms.getvymo.com/#/login");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email Format']"));
        email.sendKeys("testweb@test.com");
        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton.click();
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));
        password.sendKeys("xxxxx");
        WebElement loginButton = driver.findElement(By.xpath("//span[text()='LOG IN']"));
        loginButton.click();
        WebElement prospectModule = driver.findElement(By.xpath("(//div[text()='Prospects'])[1]"));
        prospectModule.click();
        WebElement prospectList = driver.findElement(By.xpath("//div[text()='Prospects List']"));
        prospectList.click();
        Thread.sleep(3000);

        List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@class='table-hover table table-striped']//th[@class='hoverHand' or (not(@class='hideColumn') and @data-test-id='simple-table-header') ]"));

        for(WebElement element: tableHeader) {
            String tableHeaderValue = element.getText();
            System.out.println(tableHeaderValue);

        }

        List<WebElement> prospectNames = driver.findElements(By.xpath("//table[@class='table-hover table table-striped']//tbody//td//following::td[4]//span//span[2]"));
        for(WebElement ele: prospectNames){
            String prospectName = ele.getText();
            System.out.println("Prospect Name is: "+prospectName);

            //List<WebElement> checkboxes = driver.findElements(By.xpath("(//table[@class='table-hover table table-striped']//tbody//td//following::td[4]//span//span[2]//..//..//..//td//input[@type='checkbox'])[5]"));
        }

        for(int i=0; i<prospectNames.size();i++){
            WebElement prospectName = prospectNames.get(i);
            String name= prospectName.getText();

            if(name.contains("Harisha Prod")){
                System.out.println("=========================");
                System.out.println("Select Checkbox of "+name+" i is: "+i);
                i = i+1;
                WebElement checkboxElement = driver.findElement(By.xpath("((//table[@class='table-hover table table-striped']//tbody//td//following::td[4]//span//span[2])["+i+"]//..//..//..//td//input[@type='checkbox'])"));
                checkboxElement.click();
                i=i-1;

            }
        }
        driver.quit();


    }


}