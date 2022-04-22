package pages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import strings.FacebookStrings;

public class TimelinePage {

    private WebDriver driver;
    private FacebookStrings facebookStrings = new FacebookStrings();
    private By onPage = By.xpath(facebookStrings.getElement4());

    public TimelinePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getOnPageAlert(){
        return driver.findElement(onPage).getText();
    }
}
