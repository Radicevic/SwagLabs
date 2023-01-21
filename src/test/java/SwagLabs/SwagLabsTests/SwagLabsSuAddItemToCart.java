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

public class SwagLabsSuAddItemToCart extends SwagLabsBaseTest {

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

    @Test (priority = 10)
    public void addFirstItemToCart (){
        loginDirectToHomePage();
        swagLabsItemsPage.addFirstItemFromHomePage();
        swagLabsShoppingCartPage.clickOnShoppingCartButton();
        Assert.assertEquals(swagLabsShoppingCartPage.getNameOfItemInCart(), "Sauce Labs Backpack");
        Assert.assertEquals(swagLabsShoppingCartPage.ShoppingCart.getText(), "1");
    }

    @Test (priority = 20)
    public void addSecondItemToCart (){
        loginDirectToHomePage();
        swagLabsItemsPage.addSecondItemFromHomePage();
        swagLabsShoppingCartPage.clickOnShoppingCartButton();
        Assert.assertEquals(swagLabsShoppingCartPage.getNameOfItemInCart(),"Sauce Labs Bike Light");
        Assert.assertEquals(swagLabsShoppingCartPage.ShoppingCart.getText(), "1");
    }

    @Test (priority = 30)
    public void addThirdItemToCart (){
        loginDirectToHomePage();
        swagLabsItemsPage.addThirdItemFromHomePage();
        swagLabsShoppingCartPage.clickOnShoppingCartButton();
        Assert.assertEquals(swagLabsShoppingCartPage.getNameOfItemInCart(),"Sauce Labs Bolt T-Shirt");
        Assert.assertEquals(swagLabsShoppingCartPage.ShoppingCart.getText(), "1");
    }

    @Test (priority = 40)
    public void addFourthItemToCart (){
        loginDirectToHomePage();
        swagLabsItemsPage.addFourthItemFromHomePage();
        swagLabsShoppingCartPage.clickOnShoppingCartButton();
        Assert.assertEquals(swagLabsShoppingCartPage.getNameOfItemInCart(),"Sauce Labs Fleece Jacket");
        Assert.assertEquals(swagLabsShoppingCartPage.ShoppingCart.getText(), "1");
    }

    @Test (priority = 50)
    public void addFifthItemToCart (){
        loginDirectToHomePage();
        swagLabsItemsPage.addFifthItemFromHomePage();
        swagLabsShoppingCartPage.clickOnShoppingCartButton();
        Assert.assertEquals(swagLabsShoppingCartPage.getNameOfItemInCart(),"Sauce Labs Onesie");
        Assert.assertEquals(swagLabsShoppingCartPage.ShoppingCart.getText(), "1");
    }

    @Test (priority = 60)
    public void addSixthItemToCart (){
        loginDirectToHomePage();
        swagLabsItemsPage.addSixthItemFromHomePage();
        swagLabsShoppingCartPage.clickOnShoppingCartButton();
        Assert.assertEquals(swagLabsShoppingCartPage.getNameOfItemInCart(),"Test.allTheThings() T-Shirt (Red)");
        Assert.assertEquals(swagLabsShoppingCartPage.ShoppingCart.getText(), "1");
    }

    @Test (priority = 70)
    public void addAllItemToCart (){
        loginDirectToHomePage();

        swagLabsShoppingCartPage.clickOnShoppingCartButton();
        Assert.assertEquals(swagLabsShoppingCartPage.getNumberOfItemSInCart(), ""); // Check if cart is empty
        swagLabsShoppingCartPage.clickToContinueToShoppingButton();

        swagLabsItemsPage.addFirstItemFromHomePage();
        swagLabsShoppingCartPage.clickOnShoppingCartButton();
        swagLabsShoppingCartPage.clickToContinueToShoppingButton();

        swagLabsItemsPage.addSecondItemFromHomePage();
        swagLabsShoppingCartPage.clickOnShoppingCartButton();
        swagLabsShoppingCartPage.clickToContinueToShoppingButton();

        swagLabsItemsPage.addThirdItemFromHomePage();
        swagLabsShoppingCartPage.clickOnShoppingCartButton();
        swagLabsShoppingCartPage.clickToContinueToShoppingButton();

        swagLabsItemsPage.addFourthItemFromHomePage();
        swagLabsShoppingCartPage.clickOnShoppingCartButton();
        swagLabsShoppingCartPage.clickToContinueToShoppingButton();

        swagLabsItemsPage.addFifthItemFromHomePage();
        swagLabsShoppingCartPage.clickOnShoppingCartButton();
        swagLabsShoppingCartPage.clickToContinueToShoppingButton();

        swagLabsItemsPage.addSixthItemFromHomePage();
        swagLabsShoppingCartPage.clickOnShoppingCartButton();

        Assert.assertEquals(swagLabsItemsPage.getNameOfFirstItem(), "Sauce Labs Backpack");
        Assert.assertEquals(swagLabsItemsPage.getNameOfSecondItem(),"Sauce Labs Bike Light");
        Assert.assertEquals(swagLabsItemsPage.getNameOfThirdItem(),"Sauce Labs Bolt T-Shirt");
        Assert.assertEquals(swagLabsItemsPage.getNameOfFourthItem(),"Sauce Labs Fleece Jacket");
        Assert.assertEquals(swagLabsItemsPage.getNameOfFifthItem(),"Sauce Labs Onesie");
        Assert.assertEquals(swagLabsItemsPage.getNameOfSixthItem(),"Test.allTheThings() T-Shirt (Red)");
        Assert.assertEquals(swagLabsShoppingCartPage.getNumberOfItemSInCart(), "6");
    }

    @AfterMethod
    public void tearDown (){
        driver.quit();
    }
}
