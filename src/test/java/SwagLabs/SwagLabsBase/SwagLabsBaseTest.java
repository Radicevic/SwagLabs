package SwagLabs.SwagLabsBase;

import SwagLabs.SwagLabsPages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class SwagLabsBaseTest {
    public static WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String loginPageUrl;

    String validUsername;
    String validPassword;

    public SwagLabsLoginPage swagLabsLoginPage;

    public SwagLabsShoppingCartPage swagLabsShoppingCartPage;

    public SwagLabsMenuElementsPage swagLabsMenuElementsPage;

    public SwagLabsItemsPage swagLabsItemsPage;

    public SwagLabsSortDropDownList swagLabsSortDropDownList;


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("src/test/java/SwagLabs/TestData.xlsx");
        loginPageUrl = excelReader.getStringData("URL", 1,0);
    }


    public void dropDownSelectByValue (WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void dropDownSelectByText (WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void dropDownSelectByIndex (WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    /*public void deselectValue(WebElement element, String value) {
        Select select = new Select(element);
        select.deselectByValue(value);
    }*/

    public void loginDirectToHomePage (){
        validUsername = excelReader.getStringData("Login", 1 , 0);
        validPassword = excelReader.getStringData("Login", 1 , 1);
        swagLabsLoginPage.tryLogin(validUsername, validPassword);
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
