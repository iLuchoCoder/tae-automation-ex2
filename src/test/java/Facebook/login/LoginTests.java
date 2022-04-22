package Facebook.login;

import Facebook.baseFacebook.BaseTests;
import org.testng.annotations.Test;
import pages.facebook.TimelinePage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessLogin(){
        loginPage.setUsername();
        loginPage.setPassword();
        TimelinePage timelinePage = loginPage.clickLoginButton();
        assertTrue(timelinePage.getOnPageAlert().contains("Marketplace"),
                "Alert text is incorrect");
    }
}
