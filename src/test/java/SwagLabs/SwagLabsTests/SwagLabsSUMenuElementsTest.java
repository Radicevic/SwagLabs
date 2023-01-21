package SwagLabs.SwagLabsTests;

import SwagLabs.SwagLabsBase.SwagLabsBaseTest;
import SwagLabs.SwagLabsPages.SwagLabsShoppingCartPage;
import SwagLabs.SwagLabsPages.SwagLabsMenuElementsPage;
import SwagLabs.SwagLabsPages.SwagLabsLoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsSUMenuElementsTest extends SwagLabsBaseTest {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(loginPageUrl);
        swagLabsLoginPage = new SwagLabsLoginPage();
        swagLabsMenuElementsPage = new SwagLabsMenuElementsPage();
        swagLabsShoppingCartPage = new SwagLabsShoppingCartPage();
    }

    @Test(priority = 10)
    public void standardUserManuButton () {

        String validUsername = excelReader.getStringData("Login", 1 , 0);
        String validPassword = excelReader.getStringData("Login", 1 , 1);
        swagLabsLoginPage.tryLogin(validUsername, validPassword);

        swagLabsMenuElementsPage.clickOnManuButton();
        waitElementVisible(swagLabsMenuElementsPage.CloseButton);
        Assert.assertTrue(swagLabsMenuElementsPage.CloseButton.isDisplayed());
        Assert.assertTrue(swagLabsMenuElementsPage.AllItemsButton.isDisplayed());
        Assert.assertTrue(swagLabsMenuElementsPage.AboutButton.isDisplayed());
        swagLabsMenuElementsPage.clickOnCloseButton();
        swagLabsShoppingCartPage.clickOnShoppingCart();
    }

    @Test(priority = 20)  // dovrsi
    public void standardUserAllItemsButton () {

        String validUsername = excelReader.getStringData("Login", 1 , 0);
        String validPassword = excelReader.getStringData("Login", 1 , 1);
        swagLabsLoginPage.tryLogin(validUsername, validPassword);

        swagLabsMenuElementsPage.clickOnManuButton();
        waitElementVisible(swagLabsMenuElementsPage.AllItemsButton);
    }

    @Test(priority = 30)
    public void standardUserAboutButton () {

        String validUsername = excelReader.getStringData("Login", 1 , 0);
        String validPassword = excelReader.getStringData("Login", 1 , 1);
        swagLabsLoginPage.tryLogin(validUsername, validPassword);

        swagLabsMenuElementsPage.clickOnManuButton();
        waitElementVisible(swagLabsMenuElementsPage.AboutButton);
        swagLabsMenuElementsPage.clickOnAboutButton();
        String expectedUrl = excelReader.getStringData("URL", 1, 2);
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }

    @Test(priority = 40)
    public void standardUserLogoutButton () {

        String validUsername = excelReader.getStringData("Login", 1 , 0);
        String validPassword = excelReader.getStringData("Login", 1 , 1);
        swagLabsLoginPage.tryLogin(validUsername, validPassword);

        swagLabsMenuElementsPage.clickOnManuButton();
        waitElementVisible(swagLabsMenuElementsPage.LogoutButton);
        swagLabsMenuElementsPage.clickOnLogoutButton();
        String expectedUrl = excelReader.getStringData("URL", 1, 0);
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        Assert.assertTrue(swagLabsLoginPage.LoginButton.isDisplayed());
        Assert.assertTrue(swagLabsLoginPage.Username.isDisplayed());
        Assert.assertTrue(swagLabsLoginPage.Password.isDisplayed());
    }

    @Test(priority = 50)
    public void standardUserResetAppStateButton () { //dovrsi

        String validUsername = excelReader.getStringData("Login", 1 , 0);
        String validPassword = excelReader.getStringData("Login", 1 , 1);
        swagLabsLoginPage.tryLogin(validUsername, validPassword);

        swagLabsMenuElementsPage.clickOnManuButton();
        waitElementVisible(swagLabsMenuElementsPage.ResetAppStateButton);
        swagLabsMenuElementsPage.clickOnResetAppStateButton();

    }
}
