package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgParallel {

    @Test
    public void postFacebookFeature(){
        System.out.println("It will post the tweet. |" +Thread.currentThread().getId());
    }

    @Test
    public void deletePostFacebookFeature(){
        System.out.println("It will delete the post. |" +Thread.currentThread().getId());
    }

    @Test
    public void updatePostFacebookFeature(){
        System.out.println("It will update the post. |" +Thread.currentThread().getId());
    }

    @Test
    public void openBrowserA() throws InterruptedException {
        System.out.println("I am opening browser A. |" +Thread.currentThread().getId());
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","/Users/asmit/Downloads/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.close();
    }

    @Test
    public void openBrowserB() throws InterruptedException {
        System.out.println("I am opening browser B. |" +Thread.currentThread().getId());
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","/Users/asmit/Downloads/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        Thread.sleep(1000);
        driver.close();
    }
}
