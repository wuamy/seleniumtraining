package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

/**
 * Created by amy on 8/26/2016.
 */
public class Home_Page {
    private static WebElement element = null;
    public static WebElement lnk_MyAccount(WebDriver driver){
        element = driver.findElement(By.cssSelector(".account_icon"));
        Log.info("My account link element is found");
        return element;
    }

    public static WebElement lnk_LogOut(WebDriver driver){
        element = driver.findElement(By.cssSelector("#account_logout>a"));
        Log.info("Log out link element is found");
        return element;
    }
}
