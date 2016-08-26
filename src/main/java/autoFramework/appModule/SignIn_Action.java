package autoFramework.appModule;

import org.openqa.selenium.WebDriver;
import pageObjects.*;
/**
 * Created by amy on 8/26/2016.
 */
public class SignIn_Action {
    public static void Execute(WebDriver driver){
        Home_Page.lnk_MyAccount(driver).click();

        LogIn_Page.txtbx_UserName(driver).sendKeys("amy");
        LogIn_Page.txtbx_Password(driver).sendKeys("c3qKYLErI*IClnTO");
        LogIn_Page.btn_LogIn(driver).click();
    }
}
