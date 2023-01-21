package SwagLabs.SwagLabsTests;

import SwagLabs.SwagLabsBase.SwagLabsBaseTest;
import SwagLabs.SwagLabsPages.SwagLabsItemsPage;
import SwagLabs.SwagLabsPages.SwagLabsLoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsItemsPageTest extends SwagLabsBaseTest {

    @BeforeMethod
    public void setUpPage (){
        driver.manage().window().maximize();
        driver.navigate().to(loginPageUrl);
        swagLabsLoginPage = new SwagLabsLoginPage();
        swagLabsItemsPage = new SwagLabsItemsPage();
    }

    @Test (priority = 10)
    public void clickOnItemOne () {
        loginDirectToHomePage();
        swagLabsItemsPage.clickOnItemOne();

        String expectedUrl = excelReader.getStringData("URL", 1, 3);
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        Assert.assertEquals(swagLabsItemsPage.getNameOfItem(),"Sauce Labs Backpack");
        Assert.assertTrue(swagLabsItemsPage.AddButton.isDisplayed());
    }

    @Test (priority = 20)
    public void clickOnItemTwo () {
        loginDirectToHomePage();
        swagLabsItemsPage.clickOnItemTwo();

        String expectedUrl = excelReader.getStringData("URL", 2, 3);
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        Assert.assertEquals(swagLabsItemsPage.getNameOfItem(),"Sauce Labs Bike Light");
        Assert.assertTrue(swagLabsItemsPage.AddButton.isDisplayed());
    }

    @Test (priority = 30)
    public void clickOnItemThree () {
        loginDirectToHomePage();
        swagLabsItemsPage.clickOnItemThree();

        String expectedUrl = excelReader.getStringData("URL", 3, 3);
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        Assert.assertEquals(swagLabsItemsPage.getNameOfItem(),"Sauce Labs Bolt T-Shirt");
        Assert.assertTrue(swagLabsItemsPage.AddButton.isDisplayed());
    }

    @Test (priority = 40)
    public void clickOnItemFour () {
        loginDirectToHomePage();
        swagLabsItemsPage.clickOnItemFour();

        String expectedUrl = excelReader.getStringData("URL", 4, 3);
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        Assert.assertEquals(swagLabsItemsPage.getNameOfItem(),"Sauce Labs Fleece Jacket");
        Assert.assertTrue(swagLabsItemsPage.AddButton.isDisplayed());
    }

    @Test (priority = 50)
    public void clickOnItemFive () {
        loginDirectToHomePage();
        swagLabsItemsPage.clickOnItemFive();

        String expectedUrl = excelReader.getStringData("URL", 5, 3);
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        Assert.assertEquals(swagLabsItemsPage.getNameOfItem(),"Sauce Labs Onesie");
        Assert.assertTrue(swagLabsItemsPage.AddButton.isDisplayed());
    }

    @Test (priority = 60)
    public void clickOnItemSix () {
        loginDirectToHomePage();
        swagLabsItemsPage.clickOnItemSix();

        String expectedUrl = excelReader.getStringData("URL", 6, 3);
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        Assert.assertEquals(swagLabsItemsPage.getNameOfItem(),"Test.allTheThings() T-Shirt (Red)");
        Assert.assertTrue(swagLabsItemsPage.AddButton.isDisplayed());
    }
}