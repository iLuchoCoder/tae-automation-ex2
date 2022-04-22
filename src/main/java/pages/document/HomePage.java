package pages.document;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import strings.DocumentStrings;

public class HomePage {

    private DocumentStrings documentStrings = new DocumentStrings();

    private WebDriver driver;

    private By cssElementOnPage1 = By.cssSelector(documentStrings.getElement1());
    private By cssElementOnPage2 = By.cssSelector(documentStrings.getElement2());
    private By cssElementOnPage3 = By.cssSelector(documentStrings.getElement3());
    private By cssElementOnPage4 = By.cssSelector(documentStrings.getElement4());
    private By cssElementOnPage5 = By.cssSelector(documentStrings.getElement5());
    private By cssElementOnPage6 = By.cssSelector(documentStrings.getElement6());
    private By cssElementOnPage7 = By.cssSelector(documentStrings.getElement7());
    private By cssElementOnPage8 = By.cssSelector(documentStrings.getElement8());
    private By cssElementOnPage9 = By.cssSelector(documentStrings.getElement9());
    private By cssElementOnPage10 = By.cssSelector(documentStrings.getElement10());

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public String searchCssElementOnPage1(){
        return driver.findElement(cssElementOnPage1).getText();
    }

    public String searchCssElementOnPage2(){
        return driver.findElement(cssElementOnPage2).getText();
    }

    public String searchCssElementOnPage3(){
        return driver.findElement(cssElementOnPage3).getText();
    }

    public String searchCssElementOnPage4(){
        return driver.findElement(cssElementOnPage4).getText();
    }

    public String searchCssElementOnPage5(){
        return driver.findElement(cssElementOnPage5).getText();
    }

    public String searchCssElementOnPage6(){
        return driver.findElement(cssElementOnPage6).getText();
    }

    public String searchCssElementOnPage7(){
        return driver.findElement(cssElementOnPage7).getText();
    }

    public String searchCssElementOnPage8(){
        return driver.findElement(cssElementOnPage8).getText();
    }

    public String searchCssElementOnPage9(){
        return driver.findElement(cssElementOnPage9).getText();
    }

    public String searchCssElementOnPage10(){
        return driver.findElement(cssElementOnPage10).getText();
    }
}
