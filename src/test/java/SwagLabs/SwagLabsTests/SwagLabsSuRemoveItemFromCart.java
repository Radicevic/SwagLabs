package SwagLabs.SwagLabsTests;

import SwagLabs.SwagLabsBase.SwagLabsBaseTest;
import SwagLabs.SwagLabsPages.SwagLabsItemsPage;
import SwagLabs.SwagLabsPages.SwagLabsLoginPage;
import SwagLabs.SwagLabsPages.SwagLabsShoppingCartPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SwagLabsSuRemoveItemFromCart extends SwagLabsBaseTest {

    @BeforeMethod
    public void setUpPage (){
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to(loginPageUrl);
        swagLabsLoginPage = new SwagLabsLoginPage();
        swagLabsItemsPage = new SwagLabsItemsPage();
        swagLabsShoppingCartPage = new SwagLabsShoppingCartPage();
    }

    @Test(priority = 10)
    public void removeFirstItemFromCart (){
        loginDirectToHomePage();
        Assert.assertEquals(swagLabsShoppingCartPage.getNumberOfItemSInCart(), ""); // Check if cart is empty

        swagLabsItemsPage.addFirstItemFromHomePage();
        swagLabsShoppingCartPage.clickOnShoppingCartButton();
        swagLabsShoppingCartPage.clickOnRemoveButton();
        Assert.assertEquals(swagLabsShoppingCartPage.getNumberOfItemSInCart(), ""); // Check if cart is empty
    }

    @AfterMethod
    public void tearDown (){
        driver.manage().deleteAllCookies();
        driver.quit();
    }

}
