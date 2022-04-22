package Facebook.myfriends;

import Facebook.baseFacebook.BaseTests;
import org.testng.annotations.Test;
import pages.facebook.MyFriendsPage;
import pages.facebook.TimelinePage;

import static org.testng.Assert.assertTrue;

public class MyFriendsTests extends BaseTests {

    @Test
    public void testSuccessMyFriends(){
        loginPage.setUsername();
        loginPage.setPassword();
        TimelinePage timelinePage = loginPage.clickLoginButton();
        timelinePage.waitTime();
        MyFriendsPage myFriendsPage = timelinePage.clickOnMyFriends();
        assertTrue(myFriendsPage.getOnPageAlert().contains("Amigos"),"Alert text is incorrect");
    }
}
