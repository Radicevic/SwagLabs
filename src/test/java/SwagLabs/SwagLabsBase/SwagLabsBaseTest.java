package SwagLabs.SwagLabsBase;

import SwagLabs.SwagLabsPages.SwagLabsShoppingCart;
import SwagLabs.SwagLabsPages.SwagLabsSidebarHomePage;
import SwagLabs.SwagLabsPages.SwagLabsLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class SwagLabsBaseTest {
    public static WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String loginPageUrl;

    public SwagLabsLoginPage swagLabsLoginPage;

    public SwagLabsShoppingCart swagLabsShoppingCart;

    public SwagLabsSidebarHomePage swagLabsSidebarHomePage;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("src/test/java/SwagLabs/TestData.xlsx");
        loginPageUrl = excelReader.getStringData("URL", 1,0);
    }

    public boolean isDisplayed (WebElement element){
        boolean webelement = false;
        try {
            webelement = element.isDisplayed();
        } catch (Exception e){

        }
        return webelement;
    }

    public void waitElementVisible (WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementClickable (WebElement element){
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }
}