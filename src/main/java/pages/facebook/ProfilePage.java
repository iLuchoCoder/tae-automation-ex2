package pages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import strings.FacebookStrings;

public class ProfilePage {

    private FacebookStrings facebookStrings = new FacebookStrings();
    private WebDriver driver;
    private By onPage = By.linkText(facebookStrings.getElement9());

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getOnPageAlert(){
        return driver.findElement(onPage).getText();
    }
}
