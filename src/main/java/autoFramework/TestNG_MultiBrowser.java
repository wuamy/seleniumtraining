package autoFramework;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.*;
import appModule.*;
import utility.Constant;
import utility.Log;

/**
 * Created by amy on 8/29/2016.
 */
public class TestNG_MultiBrowser {
    public WebDriver driver = null;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser) throws Exception {
        //check if parameter passed from Testng is 'firefox'
        if (browser.equalsIgnoreCase("firefox")){
            //create firefox instance
            driver = new FirefoxDriver();
        }
        // check if parameter passed as 'chrome'
        else if (browser.equalsIgnoreCase("chrome")){
            //set path to chrome driver
            System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPR\\chromedriver.exe");
            //create chrome instance
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("ie")){
            //set path to IEdriver.exe
            System.setProperty("webdriver.ie.driver","C:\\SeleniumPR\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else {
            //if no browser passed throw exception
            throw new Exception("Browser is not correct");
        }

        // add login file
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("Selenium_Test_001");

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
