package Document.baseDocument;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.document.HomePage;
import strings.DocumentStrings;


public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;
    private static DocumentStrings elementsDocument = new DocumentStrings();

    @BeforeClass
    public void SetUpDocument(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(elementsDocument.getUrl());
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
    }

    @AfterClass
    public void shutdown(){
        driver.quit();
    }
}
