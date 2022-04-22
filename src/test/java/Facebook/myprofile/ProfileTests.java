package Facebook.myprofile;

import Facebook.baseFacebook.BaseTests;
import org.testng.annotations.Test;
import pages.facebook.ProfilePage;
import pages.facebook.TimelinePage;

import static org.testng.Assert.assertTrue;

public class ProfileTests extends BaseTests {

    @Test
    public void testSuccessProfile(){
        loginPage.setUsername();
        loginPage.setPassword();
        TimelinePage timelinePage = loginPage.clickLoginButton();
        timelinePage.waitTime();
        ProfilePage profilePage = timelinePage.clickOnMyProfile();
        assertTrue(profilePage.getOnPageAlert().contains("Amigos"),"Alert text is incorrect");
    }
}
