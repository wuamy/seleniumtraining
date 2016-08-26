package autoFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by amy on 8/22/2016.
 */
public class FirstTestCase {
    public static void main(String[] args){
        //create new instance of firefox driver
        WebDriver driver = new FirefoxDriver();

        //launch the online store website
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://store.demoqa.com/");

        //print a log on the screen
        System.out.println("Successfully opened the website");

        //login to a user account
        driver.findElement(By.cssSelector(".account_icon")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        //enter user id and password
        driver.findElement(By.cssSelector("#log")).sendKeys("amy");
        driver.findElement(By.cssSelector("#pwd")).sendKeys("c3qKYLErI*IClnTO");
        driver.findElement(By.cssSelector("#login")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#account_logout>a")).click();

        //wait for 5 second
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Close the driver
        //driver.quit();
    }
}
