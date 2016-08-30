package autoFramework;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import pageObjects.*;
import appModule.*;
import utility.Constant;
import utility.Log;

/**
 * Created by amy on 8/29/2016.
 */
public class TestNG_Framework {
    public WebDriver driver = null;

    @BeforeMethod
    public void beoreMethod() throws Exception {
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("Selenium_Test_001");
        driver = new FirefoxDriver();
        Log.info("New driver instantiated");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Log.info("Implicit wait applied on the driver for 10 seconds");
        driver.get(Constant.URL);
    }

    @Test
    public void main() throws Exception {
        SignIn_Action.Execute(driver,Constant.Username,Constant.Password);
        Log.info("sign in successfully");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Home_Page.lnk_LogOut(driver).click();
        Log.info("Click action is performed on Log Out link");

    }

    //@AfterMethod
    /**
    public void afterMethod(){
        driver.quit();
    } */
}
