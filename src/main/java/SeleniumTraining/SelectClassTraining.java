package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClassTraining {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","/Users/asmit/Downloads/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();



        //Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
        //select.selectByValue("2");
        //select.selectByIndex(1);
//        select.selectByVisibleText("Aqua");
//        Thread.sleep(1000);

        Select select1 = new Select(driver.findElement(By.id("cars")));

        List<WebElement> listOfOptions= select1.getOptions();

        if(select1.isMultiple()){

        for(WebElement element: listOfOptions){
            System.out.println("Options present within Dropdown are: "+element.getText());

        }

        Thread.sleep(1000);

        select1.selectByValue("volvo");
        select1.selectByValue("opel");
        select1.selectByValue("audi");

        WebElement firstOption= select1.getFirstSelectedOption();
        System.out.println("Fist selected option is : "+firstOption.getText());


        List<WebElement> all = select1.getAllSelectedOptions();
        
        for(WebElement selected:all){
            System.out.println("All selected Options are: "+selected.getText());

        }
        
       

        Thread.sleep(1000);

            JavascriptExecutor exe = (JavascriptExecutor) driver;
            exe.executeScript("window.scrollBy(0,1000)","");

//        select1.deselectByValue("volvo");
//        select1.deselectByIndex(2);
//        select1.deselectByVisibleText("Audi");

         select1.deselectAll();

         

            Thread.sleep(1000);





        }

        driver.close();

    }
}
