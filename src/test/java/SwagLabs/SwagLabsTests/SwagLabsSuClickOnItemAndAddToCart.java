package SwagLabs.SwagLabsTests;

import SwagLabs.SwagLabsBase.SwagLabsBaseTest;
import SwagLabs.SwagLabsPages.SwagLabsItemsPage;
import SwagLabs.SwagLabsPages.SwagLabsLoginPage;
import SwagLabs.SwagLabsPages.SwagLabsShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsSuClickOnItemAndAddToCart extends SwagLabsBaseTest {

    @BeforeMethod
    public void setUpPage (){
        driver.manage().window().maximize();
        driver.navigate().to(loginPageUrl);
        swagLabsLoginPage = new SwagLabsLoginPage();
        swagLabsItemsPage = new SwagLabsItemsPage();
        swagLabsShoppingCartPage = new SwagLabsShoppingCartPage();
    }

    @Test(priority = 10)
    public void addItemOneToCart () {
        loginDirectToHomePage();
        swagLabsItemsPage.clickOnItemOne();
        swagLabsItemsPage.clickOnAddButton();
        swagLabsShoppingCartPage.clickOnShoppingCart();
        Assert.assertEquals(swagLabsShoppingCartPage.getNameOfItemInCart(), "Sauce Labs Backpack");
        Assert.assertEquals(swagLabsShoppingCartPage.ShoppingCart.getText(), "1");

    }

    @Test(priority = 20)
    public void addItemTwoToCart () {
        loginDirectToHomePage();
        swagLabsItemsPage.clickOnItemTwo();
        swagLabsItemsPage.clickOnAddButton();
        swagLabsShoppingCartPage.clickOnShoppingCart();
        Assert.assertEquals(swagLabsShoppingCartPage.getNameOfItemInCart(), "Sauce Labs Bike Light");
        Assert.assertEquals(swagLabsShoppingCartPage.ShoppingCart.getText(), "1");
    }

    @Test(priority = 30)
    public void addItemThreeToCart () {
        loginDirectToHomePage();
        swagLabsItemsPage.clickOnItemThree();
        swagLabsItemsPage.clickOnAddButton();
        swagLabsShoppingCartPage.clickOnShoppingCart();
        Assert.assertEquals(swagLabsShoppingCartPage.getNameOfItemInCart(), "Sauce Labs Bolt T-Shirt");
        Assert.assertEquals(swagLabsShoppingCartPage.ShoppingCart.getText(), "1");
    }

    @Test(priority = 40)
    public void addItemFourToCart () {
        loginDirectToHomePage();
        swagLabsItemsPage.clickOnItemFour();
        swagLabsItemsPage.clickOnAddButton();
        swagLabsShoppingCartPage.clickOnShoppingCart();
        Assert.assertEquals(swagLabsShoppingCartPage.getNameOfItemInCart(), "Sauce Labs Fleece Jacket");
        Assert.assertEquals(swagLabsShoppingCartPage.ShoppingCart.getText(), "1");
    }

    @Test(priority = 50)
    public void addItemFiveToCart () {
        loginDirectToHomePage();
        swagLabsItemsPage.clickOnItemFive();
        swagLabsItemsPage.clickOnAddButton();
        swagLabsShoppingCartPage.clickOnShoppingCart();
        Assert.assertEquals(swagLabsShoppingCartPage.getNameOfItemInCart(), "Sauce Labs Onesie");
        Assert.assertEquals(swagLabsShoppingCartPage.ShoppingCart.getText(), "1");
    }

    @Test(priority = 60)
    public void addItemSixToCart () {
        loginDirectToHomePage();
        swagLabsItemsPage.clickOnItemSix();
        swagLabsItemsPage.clickOnAddButton();
        swagLabsShoppingCartPage.clickOnShoppingCart();
        Assert.assertEquals(swagLabsShoppingCartPage.getNameOfItemInCart(), "Test.allTheThings() T-Shirt (Red)");
        Assert.assertEquals(swagLabsShoppingCartPage.ShoppingCart.getText(), "1");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
