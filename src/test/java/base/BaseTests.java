package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {

    private WebDriver driver;

    public void SetUp(String url){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        List<WebElement> elements = driver.findElements(By.cssSelector("body:nth-child(2) div.container:nth-child(1) > p:nth-child(3)"));

        System.out.println(elements.size());

        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.SetUp("http://test-page-paul.herokuapp.com/");
    }
}
