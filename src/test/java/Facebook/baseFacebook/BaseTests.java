package Facebook.baseFacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.facebook.LoginPage;
import strings.FacebookStrings;

public class BaseTests {
    private WebDriver driver;
    protected LoginPage loginPage;
    private static FacebookStrings elementsFacebook = new FacebookStrings();

    @BeforeClass
    public void SetUpDocument(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(elementsFacebook.getUrl());
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
    }

    @AfterClass
    public void shutdown(){
        driver.quit();
    }
}
