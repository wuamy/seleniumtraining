package pageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/**
 * Created by amy on 8/26/2016.
 */
public class LogIn_Page {
    private static WebElement element = null;

    public static WebElement txtbx_UserName(WebDriver driver){
        element = driver.findElement(By.cssSelector("#log"));
        Log.info("Username text box is found");
        return element;
    }
    public static WebElement txtbx_Password(WebDriver driver){
        element = driver.findElement(By.cssSelector("#pwd"));
        Log.info("User password text box is found");
        return element;
    }
    public static WebElement btn_LogIn(WebDriver driver){
        element = driver.findElement(By.cssSelector("#login"));
        Log.info("Submit button is found");
        return element;
    }


}
