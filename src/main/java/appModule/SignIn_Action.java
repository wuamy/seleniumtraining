package appModule;

import org.openqa.selenium.WebDriver;
import pageObjects.*;
/**
 * Created by amy on 8/26/2016.
 */
public class SignIn_Action {
    public static void Execute(WebDriver driver, String sUname, String sPassword){
        Home_Page.lnk_MyAccount(driver).click();
        // enter user id and password through a variable
        LogIn_Page.txtbx_UserName(driver).sendKeys(sUname);
        //LogIn_Page.txtbx_Password(driver).sendKeys("c3qKYLErI*IClnTO");
        LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);
        LogIn_Page.btn_LogIn(driver).click();
    }
}
