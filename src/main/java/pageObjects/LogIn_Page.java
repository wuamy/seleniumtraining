package pageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by amy on 8/26/2016.
 */
public class LogIn_Page {
    private static WebElement element = null;

    public static WebElement txtbx_UserName(WebDriver driver){
        element = driver.findElement(By.cssSelector("#log"));
        return element;
    }
    public static WebElement txtbx_Password(WebDriver driver){
        element = driver.findElement(By.cssSelector("#pwd"));
        return element;
    }
    public static WebElement btn_LogIn(WebDriver driver){
        element = driver.findElement(By.cssSelector("#login"));
        return element;
    }


}
