package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    private WebDriver driver;

    public void SetUp(String url){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.SetUp("http://test-page-paul.herokuapp.com/");
    }
}
