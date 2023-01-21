package SwagLabs.SwagLabsTests;

import SwagLabs.SwagLabsBase.SwagLabsBaseTest;
import SwagLabs.SwagLabsPages.SwagLabsShoppingCart;
import SwagLabs.SwagLabsPages.SwagLabsSidebarHomePage;
import SwagLabs.SwagLabsPages.SwagLabsLoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsStandardUserHomePageTest extends SwagLabsBaseTest {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(loginPageUrl);
        swagLabsLoginPage = new SwagLabsLoginPage();
        swagLabsSidebarHomePage = new SwagLabsSidebarHomePage();
        swagLabsShoppingCart = new SwagLabsShoppingCart();
    }

    @Test(priority = 10) //blblblb
    public void standardUserHomePageManuButton () {

        String validUsername = excelReader.getStringData("Login", 1 , 0);
        String validPassword = excelReader.getStringData("Login", 1 , 1);
        swagLabsLoginPage.tryLogin(validUsername, validPassword);

        swagLabsSidebarHomePage.clickOnManuButton();
        waitElementVisible(swagLabsSidebarHomePage.CloseButton);
        Assert.assertTrue(swagLabsSidebarHomePage.CloseButton.isDisplayed());
        Assert.assertTrue(swagLabsSidebarHomePage.AllItemsButton.isDisplayed());
        Assert.assertTrue(swagLabsSidebarHomePage.AboutButton.isDisplayed());
        swagLabsSidebarHomePage.clickOnCloseButton();
        swagLabsShoppingCart.clickOnShoppingCart();
        swagLabsShoppingCart.clickOnShoppingCart();
    }
}
