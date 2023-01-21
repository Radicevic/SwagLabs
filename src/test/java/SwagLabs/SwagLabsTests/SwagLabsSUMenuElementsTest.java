package SwagLabs.SwagLabsTests;

import SwagLabs.SwagLabsBase.SwagLabsBaseTest;
import SwagLabs.SwagLabsPages.SwagLabsShoppingCart;
import SwagLabs.SwagLabsPages.SwagLabsMenuElements;
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
        swagLabsMenuElements = new SwagLabsMenuElements();
        swagLabsShoppingCart = new SwagLabsShoppingCart();
    }

    @Test(priority = 10)
    public void standardUserManuButton () {

        String validUsername = excelReader.getStringData("Login", 1 , 0);
        String validPassword = excelReader.getStringData("Login", 1 , 1);
        swagLabsLoginPage.tryLogin(validUsername, validPassword);

        swagLabsMenuElements.clickOnManuButton();
        waitElementVisible(swagLabsMenuElements.CloseButton);
        Assert.assertTrue(swagLabsMenuElements.CloseButton.isDisplayed());
        Assert.assertTrue(swagLabsMenuElements.AllItemsButton.isDisplayed());
        Assert.assertTrue(swagLabsMenuElements.AboutButton.isDisplayed());
        swagLabsMenuElements.clickOnCloseButton();
        swagLabsShoppingCart.clickOnShoppingCart();
    }

    @Test(priority = 20)  // dovrsi
    public void standardUserAllItemsButton () {

        String validUsername = excelReader.getStringData("Login", 1 , 0);
        String validPassword = excelReader.getStringData("Login", 1 , 1);
        swagLabsLoginPage.tryLogin(validUsername, validPassword);

        swagLabsMenuElements.clickOnManuButton();
        waitElementVisible(swagLabsMenuElements.AllItemsButton);
    }

    @Test(priority = 30)  // dovrsi
    public void standardUserAboutButton () {

        String validUsername = excelReader.getStringData("Login", 1 , 0);
        String validPassword = excelReader.getStringData("Login", 1 , 1);
        swagLabsLoginPage.tryLogin(validUsername, validPassword);

        swagLabsMenuElements.clickOnManuButton();
        waitElementVisible(swagLabsMenuElements.AboutButton);
        swagLabsMenuElements.clickOnAboutButton();
        String expectedUrl = excelReader.getStringData("URL", 1, 2);
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }
}
