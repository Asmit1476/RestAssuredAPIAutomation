package SeleniumTraining;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Rectangle;

import java.lang.management.ManagementFactory;

public class HeightAndWidth {


    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        WebElement ele = driver.findElement(By.cssSelector("#id='ClickMe"));
        Dimension x = ele.getSize();
                x.getHeight();
                x.getWidth();
        x.getWidth();
               int str= x.width;
               int stry = x.height;

        Point p = ele.getLocation();
                p.getX();
                p.getY();
                int j = (int )p.x;
                int k = (int )p.y;

        Rectangle rect = ele.getRect();

        System.out.println("X-Axis - " + rect.x ); //from left top corner of element
        System.out.println("Y-Axis - " + rect.y );
        System.out.println("Element Width - " + rect.width );
        System.out.println("Element Height - " + rect.height );

        //OR

        System.out.println(rect.getX());
        System.out.println(rect.getY());
        System.out.println(rect.getWidth());
        System.out.println(rect.getHeight());



    }
}
