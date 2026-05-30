package com.page;

import com.test.utility.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;

public class LinkedIn_LoginPage {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/asmit/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/login");
        driver.manage().window().maximize();
    }


    @DataProvider(name="TestData")
    public Object[][] getTestData() throws IOException, ParseException {

        Object[][] testData = TestUtil.getDataFromExcel();
        System.out.println("Data present in the Excel sheet are :" + Arrays.deepToString(testData));
        return testData;
    }


    @Test(dataProvider = "TestData")
    public void Login(String email, String password) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='username']")).clear();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        Thread.sleep(1000);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
