package appModule;

import org.openqa.selenium.WebDriver;
import pageObjects.*;
import utility.Log;
/**
 * Created by amy on 8/26/2016.
 */
public class SignIn_Action {
    public static void Execute(WebDriver driver, String sUname, String sPassword){
        Home_Page.lnk_MyAccount(driver).click();
        Log.info("Click actin performed on My account link");
        // enter user id and password through a variable
        LogIn_Page.txtbx_UserName(driver).sendKeys(sUname);
        Log.info("Type in user login name");
        //LogIn_Page.txtbx_Password(driver).sendKeys("c3qKYLErI*IClnTO");
        LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
        Log.info("Type in user login password");
        LogIn_Page.btn_LogIn(driver).click();
        Log.info("Click submit button");
    }
}
