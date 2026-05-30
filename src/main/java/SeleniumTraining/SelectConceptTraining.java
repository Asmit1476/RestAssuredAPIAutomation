package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectConceptTraining {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver","/Users/asmit/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        //click drop-down button
        Select select= new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
        select.selectByValue("2");
        //select.selectByIndex(4);
        //select.selectByVisibleText("Aqua");

        WebElement first= select.getFirstSelectedOption();
        String str= first.getText();
        System.out.println("First Selected Option is: "+str);

        /////////////////////////////////////////////

        Select select1= new Select(driver.findElement(By.id("cars")));

        if(select1.isMultiple()){

            List<WebElement> options= select1.getOptions();
            for(WebElement ele: options){
                System.out.println("All options are: "+ele.getText());
            }

            select1.selectByValue("volvo");
            select1.selectByValue("saab");
            select1.selectByValue("opel");
            select1.selectByValue("audi");



            select1.deselectByValue("saab");
            select1.deselectByVisibleText("Audi");
            select1.deselectByIndex(3);

            List<WebElement> all= select1.getAllSelectedOptions();

            for(WebElement ele: all){
                System.out.println("All selected options are: "+ele.getText());
            }

            //select1.deselectAll();
        }




        driver.quit();


    }
}
