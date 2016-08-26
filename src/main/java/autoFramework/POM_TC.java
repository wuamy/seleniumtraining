package autoFramework;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by amy on 8/22/2016.
 */
public class POM_TC {
    private static WebDriver driver = null;

    public static void main(String[] args){
        //create new instance of firefox driver
        driver = new FirefoxDriver();

        //launch the online store website
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://store.demoqa.com/");

        //print a log on the screen
        System.out.println("Successfully opened the website");

        //login to a user account
        Home_Page.lnk_MyAccount(driver).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        //enter user id and password
        LogIn_Page.txtbx_UserName(driver).sendKeys("amy");
        LogIn_Page.txtbx_Password(driver).sendKeys("c3qKYLErI*IClnTO");
        LogIn_Page.btn_LogIn(driver).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Home_Page.lnk_LogOut(driver).click();

        //wait for 5 second
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Close the driver
        //driver.quit();
    }
}
