package pages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import strings.FacebookStrings;

import java.util.concurrent.TimeUnit;

public class TimelinePage {

    private WebDriver driver;
    private FacebookStrings facebookStrings = new FacebookStrings();
    private By onPage = By.xpath(facebookStrings.getElement4());
    private By dropDownProfile = By.xpath(facebookStrings.getElement5());
    private By closeSession = By.xpath(facebookStrings.getElement6());
    private By myProfile = By.xpath(facebookStrings.getElement8());
    private By myFriends = By.xpath(facebookStrings.getElement10());

    public TimelinePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getOnPageAlert(){
        return driver.findElement(onPage).getText();
    }

    public void clickDropDownProfile(){
        driver.findElement(dropDownProfile).click();
    }

    public LoginPage clickCloseSession(){
        driver.findElement(closeSession).click();
        return new LoginPage(driver);
    }

    public ProfilePage clickOnMyProfile(){
        driver.findElement(myProfile).click();
        return new ProfilePage(driver);
    }

    public MyFriendsPage clickOnMyFriends(){
        driver.findElement(myFriends).click();
        return new MyFriendsPage(driver);
    }

    public void waitTime(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
