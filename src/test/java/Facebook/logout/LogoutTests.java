package Facebook.logout;

import Facebook.baseFacebook.BaseTests;
import org.testng.annotations.Test;
import pages.facebook.LoginPage;
import pages.facebook.TimelinePage;

import static org.testng.Assert.assertTrue;

public class LogoutTests extends BaseTests {

    @Test
    public void testSuccessLogut(){
        loginPage.setUsername();
        loginPage.setPassword();
        TimelinePage timelinePage = loginPage.clickLoginButton();
        timelinePage.clickDropDownProfile();
        timelinePage.waitTime();
        LoginPage loginPage = timelinePage.clickCloseSession();
        assertTrue(loginPage.getOnPageAlert().contains("¿Olvidaste tu contraseña?"),"Alert text is incorrect");
    }
}
