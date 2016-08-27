package autoFramework;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.Home_Page;
import appModule.SignIn_Action;
import utility.Constant;

/**
 * Created by wu on 8/27/2016.
 */
public class Global_Var_TC {
    private static WebDriver driver = null;

        public static void main(String[] args){
            //create new instance of firefox driver
            driver = new FirefoxDriver();

            //launch the online store website
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(Constant.URL);

            //print a log on the screen
            System.out.println("Successfully opened the website");

            //login to a user account
            //Home_Page.lnk_MyAccount(driver).click();
            //SignIn_Action.Execute(driver,"amy","c3qKYLErI*IClnTO");
            SignIn_Action.Execute(driver,Constant.Username,Constant.Password);
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

            //enter user id and password
            //LogIn_Page.txtbx_UserName(driver).sendKeys("amy");
            //LogIn_Page.txtbx_Password(driver).sendKeys("c3qKYLErI*IClnTO");
            //LogIn_Page.btn_LogIn(driver).click();
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            Home_Page.lnk_LogOut(driver).click();

            //wait for 5 second
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            //Close the driver
            //driver.quit();
        }
    }

