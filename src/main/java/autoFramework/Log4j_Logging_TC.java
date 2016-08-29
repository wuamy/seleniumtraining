package autoFramework;
//import package Log4j.*;
import org.apache.bcel.classfile.*;
import org.apache.log4j.xml.DOMConfigurator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.*;
import appModule.*;
import utility.Log;
import utility.Constant;

/**
 * Created by amy on 8/29/2016.
 */
public class Log4j_Logging_TC {
    private static WebDriver driver = null;

    public static void main(String[] args) throws Exception {
        //Provide Log4j configuration settings
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("Selenium_Test_001");

        driver = new FirefoxDriver();
        Log.info("New driver instantiated");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.get(Constant.URL);
        Log.info("Web app launched");

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        SignIn_Action.Execute(driver,Constant.Username,Constant.Password);
        Log.info("sign in successfully");

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Home_Page.lnk_LogOut(driver).click();
        Log.info("Click action is performed on Logout link");

        Log.endTestCase("Selenium_Test_001");

    }
}
