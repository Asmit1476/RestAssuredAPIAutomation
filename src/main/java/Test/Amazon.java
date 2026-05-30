package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Amazon {
    public static void main(String[] args) {
        WebDriver driver;

        //System.setProperty("webdriver.chrome.driver","/Users/asmit/Downloads/chromedriver");
        //WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement searchBox = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
        searchBox.click();
        searchBox.sendKeys("Mobiles");

        WebElement submit = driver.findElement(By.xpath("//input[@type = 'submit']"));
        submit.click();

       // List<WebElement> mobileLists = driver.findElements(By.xpath("//a/span[@class='a-size-medium a-color-base a-text-normal']"));


        List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

        for(WebElement ele: priceList){

            int price;
            try{
                String p = ele.getText();
                String pp = p.replace(",","");
                 price = Integer.parseInt(pp);
                System.out.println(price);
                if(price>5000){
                    System.out.println("Price of the mobile is: "+price);
                }
            }
            catch (NumberFormatException ex){
                ex.printStackTrace();
            }


        }
    }
}
