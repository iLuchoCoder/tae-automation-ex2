package pages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import strings.FacebookStrings;

public class MyFriendsPage {

    private WebDriver driver;
    private FacebookStrings facebookStrings = new FacebookStrings();
    private By onPage = By.xpath(facebookStrings.getElement11());

    public MyFriendsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getOnPageAlert(){
        return driver.findElement(onPage).getText();
    }
}
