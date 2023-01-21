package SwagLabs.SwagLabsTests;

import SwagLabs.SwagLabsBase.SwagLabsBaseTest;
import SwagLabs.SwagLabsPages.SwagLabsMenuElements;
import SwagLabs.SwagLabsPages.SwagLabsLoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsLoginTest extends SwagLabsBaseTest {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to(loginPageUrl);
        swagLabsLoginPage = new SwagLabsLoginPage();
        swagLabsMenuElements = new SwagLabsMenuElements();
    }

    @Test (priority = 10)
    public void userCanLogin () {
        for (int i = 1; i <= excelReader.getLastRow("Login"); i++){
        String validUsername = excelReader.getStringData("Login", i , 0);
        String validPassword = excelReader.getStringData("Login", 1 , 1);

        swagLabsLoginPage.tryLogin(validUsername, validPassword);
        Assert.assertFalse(isDisplayed(swagLabsLoginPage.LoginButton));
        String expectedUrl = excelReader.getStringData("URL", 1, 1 );
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        swagLabsMenuElements.clickOnManuButton();
        waitElementClickable(swagLabsMenuElements.LogoutButton);
        swagLabsMenuElements.clickOnLogoutButton();
        }
    }

    @Test (priority = 20)
    public void userCanNotLoginWithEmptyUsernameField () {

        String inValidUsername = "";
        String validPassword = excelReader.getStringData("Login", 1 , 1);

        swagLabsLoginPage.tryLogin(inValidUsername, validPassword);
        Assert.assertEquals(swagLabsLoginPage.getNotificationText(), "Epic sadface: Username is required");
        Assert.assertTrue(isDisplayed(swagLabsLoginPage.LoginButton));
        Assert.assertEquals(driver.getCurrentUrl(), loginPageUrl);
    }

    @Test (priority = 30)
    public void userCanNotLoginWithEmptyPasswordField () {
        for (int i = 1; i <= excelReader.getLastRow("Login"); i++){

        String validUsername = excelReader.getStringData("Login", i , 0);
        String inValidPassword = "";

        swagLabsLoginPage.tryLogin(validUsername, inValidPassword);
        Assert.assertEquals(swagLabsLoginPage.getNotificationText(), "Epic sadface: Password is required");
        Assert.assertTrue(isDisplayed(swagLabsLoginPage.LoginButton));
        Assert.assertEquals(driver.getCurrentUrl(), loginPageUrl);
        }
    }

    @Test (priority = 40)
    public void userCanNotLoginWithEmptyUsernameAndPasswordField () {

        String inValidUsername = "";
        String inValidPassword = "";

        swagLabsLoginPage.tryLogin(inValidUsername, inValidPassword);
        Assert.assertEquals(swagLabsLoginPage.getNotificationText(), "Epic sadface: Username is required");
        Assert.assertTrue(isDisplayed(swagLabsLoginPage.LoginButton));
        Assert.assertEquals(driver.getCurrentUrl(), loginPageUrl);
    }

    @Test (priority = 50)
    public void userCanNotLoginWithInvalidUsername_locked_out_userAndValidPassword () {

        String inValidUsername = excelReader.getStringData("Login", 1 , 2);
        String validPassword = excelReader.getStringData("Login", 1 , 1);

        swagLabsLoginPage.tryLogin(inValidUsername, validPassword);
        Assert.assertEquals(swagLabsLoginPage.getNotificationText(), "Epic sadface: Sorry, this user has been locked out.");
        Assert.assertTrue(isDisplayed(swagLabsLoginPage.LoginButton));
        Assert.assertEquals(driver.getCurrentUrl(), loginPageUrl);

    }

    @Test (priority = 60)
    public void userCanNotLoginWithValidUsername_standard_userButInvalidPassword () {
        for (int i = 1; i <= excelReader.getLastRow("Login"); i++){
            String validUsername = excelReader.getStringData("Login", 1 , 0);
            String inValidPassword = excelReader.getStringData("Login", i , 3);

            swagLabsLoginPage.tryLogin(validUsername, inValidPassword);
            Assert.assertEquals(swagLabsLoginPage.getNotificationText(), "Epic sadface: Username and password do not match any user in this service");
            Assert.assertTrue(isDisplayed(swagLabsLoginPage.LoginButton));
            Assert.assertEquals(driver.getCurrentUrl(), loginPageUrl);
        }
    }

    @Test (priority = 70)
    public void userCanNotLoginWithValidUsername_problem_userButInvalidPassword () {
        for (int i = 1; i <= excelReader.getLastRow("Login"); i++){
            String validUsername = excelReader.getStringData("Login", 2 , 0);
            String inValidPassword = excelReader.getStringData("Login", i , 3);

            swagLabsLoginPage.tryLogin(validUsername, inValidPassword);
            Assert.assertEquals(swagLabsLoginPage.getNotificationText(), "Epic sadface: Username and password do not match any user in this service");
            Assert.assertTrue(isDisplayed(swagLabsLoginPage.LoginButton));
            Assert.assertEquals(driver.getCurrentUrl(), loginPageUrl);
        }
    }

    @Test (priority = 80)
    public void userCanNotLoginWithValidUsername_performance_glitch_userButInvalidPassword () {
        for (int i = 1; i <= excelReader.getLastRow("Login"); i++){
            String validUsername = excelReader.getStringData("Login", 3 , 0);
            String inValidPassword = excelReader.getStringData("Login", i , 3);

            swagLabsLoginPage.tryLogin(validUsername, inValidPassword);
            Assert.assertEquals(swagLabsLoginPage.getNotificationText(), "Epic sadface: Username and password do not match any user in this service");
            Assert.assertTrue(isDisplayed(swagLabsLoginPage.LoginButton));
            Assert.assertEquals(driver.getCurrentUrl(), loginPageUrl);
        }
    }


}
