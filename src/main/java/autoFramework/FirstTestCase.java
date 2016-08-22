package autoFramework;

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
        driver.get("http://store.demoqa.com/");

        //print a log on the screen
        System.out.println("Successfully opened the website");

        //wait for 5 second
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Close the driver
        driver.quit();
    }
}
