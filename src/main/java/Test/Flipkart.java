package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*Below code will search iPhone then click on iPhone 17 listed in the suggestions after that
it will list all the cost of iphone and if the cost of iphone 17 is greater than 100000 then it will get the
details of the same iphone and then click on it

Use Ctrl + Shift + P to freeze the page and then type focus and then select emulated focus option then the webpage will be
freezed and we can get the xpath of the suggestion listed on typing in the search box
Or Go to "Sources" tab of Inspect Element and then Press Fn + F8 button in keyboard and then inspect (Best Way)
 */

public class Flipkart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        //WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        //searchBox.sendKeys("iPhone");
        Thread.sleep(2000);
//        WebDriverWait waitUntilElementAppears = new WebDriverWait(driver,3000);
//        waitUntilElementAppears.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='q']"))).click();
        //searchBox.click();
        WebElement searchBox = driver.findElement(By.name("q"));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].click();", searchBox
        );

        searchBox.sendKeys("iPhone");

//        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.ENTER).perform(); // if we don't want to click from suggestion then we can directly hit enter in the search box

// This below line of code will handle suggestions
        System.out.println("Inprogress");
        //By suggesions = By.xpath("//form[contains(@class,'header-form-search')]//li[contains(@class,'humcQA')]");
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("Sc1DCn")));
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(suggesions));
//        List<WebElement> suggestions = wait.until(
//                ExpectedConditions.visibilityOfAllElementsLocatedBy(
//                        By.xpath("//ul[contains(@class,'col-12-12 I01Bvi O1jfZ8')]")
//                ));
        //div[@class="pVNZxj KIiP4i" and text()=" 17"]

        List<WebElement> allSuggestions = driver.findElements(By.className("Sc1DCn"));
        System.out.println("Testing");

        for(WebElement ele: allSuggestions){
            String text = ele.getText();
            System.out.println("Text is: "+text);

            if(text.contains("iphone 17")){
                ele.click();
                Thread.sleep(2000);
                break;
            }


        }
//Get the cost of each iPhone which are listed in the page after clicking iPhone 17
        Thread.sleep(2000);
        List<WebElement> priceList = wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.xpath("//div[@class='QiMO5r']//div[@class='hZ3P6w DeU9vF']")
                )));

        int index =0;
        for(WebElement ele: priceList){
            index++;
            String p = ele.getText();
            String p1 = p.replaceAll(",","");
            String price = p1.substring(1);

            System.out.println("Price of iPhone is: "+price);

            if(Integer.parseInt(price)>100000){

                System.out.println("Price of required iPhone is: "+price);
                //This will scroll to the specific element
                JavascriptExecutor js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].scrollIntoView(false);",ele); //This scrolls the element to the bottom of the viewport instead of the top, so it won’t overshoot
                System.out.println("Index is: "+index);

                WebElement iPhoneFullName = driver.findElement(By.xpath("//div[@class='QiMO5r']//div[@class='hZ3P6w DeU9vF'])["+index+"]/../../../..//div/child::div[contains(text(),'iPhone 17')]"));

                String iPhoneFullNameText = iPhoneFullName.getText();

                if(iPhoneFullNameText.contains("iPhone 17")){
                    System.out.println("Full Name is: "+iPhoneFullNameText);
                    iPhoneFullName.click();
                    Thread.sleep(3000);
                }
                break;

            }
        }



        driver.quit();
    }
}
