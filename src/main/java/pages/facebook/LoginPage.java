package pages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import strings.FacebookStrings;

public class LoginPage {

    private FacebookStrings facebookStrings = new FacebookStrings();
    private WebDriver driver;
    private By usernameField = By.cssSelector(facebookStrings.getElement1());
    private By passwordField = By.cssSelector(facebookStrings.getElement2());
    private By loginButton = By.tagName(facebookStrings.getElement3());
    private By onPage = By.linkText(facebookStrings.getElement7());

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(){
        driver.findElement(usernameField).sendKeys(facebookStrings.getUsername());
    }

    public void setPassword(){
        driver.findElement(passwordField).sendKeys(facebookStrings.getPassword());
    }

    public TimelinePage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new TimelinePage(driver);
    }

    public String getOnPageAlert(){
        return driver.findElement(onPage).getText();
    }
}
