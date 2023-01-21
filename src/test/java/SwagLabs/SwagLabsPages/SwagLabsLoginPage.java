package SwagLabs.SwagLabsPages;

import SwagLabs.SwagLabsBase.SwagLabsBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage extends SwagLabsBaseTest {
    public SwagLabsLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "input[placeholder = 'Username']")  //Koristim find po css tagu!
    public WebElement Username;

    @FindBy (css = "input[placeholder = 'Password']")  //Koristim find po css tagu!
    public WebElement Password;

    @FindBy (id = "login-button")
    public WebElement LoginButton;

    @FindBy (css = "h3[data-test = 'error']")
    public WebElement Notification;

    @FindBy (css = ".svg-inline--fa.fa-times.fa-w-11.")
    public WebElement NotificationEmptyUsername;

    //---------------------------------------------------

    public void insertUserName (String username){
        Username.clear();
        Username.sendKeys(username);
    }

    public void insertPassword (String password){
        Password.clear();
        Password.sendKeys(password);
    }

    public void clickOnLoginButton(){
        LoginButton.click();
    }

    public void tryLogin (String username, String password) {
        insertUserName(username);
        insertPassword(password);
        clickOnLoginButton();
    }

    public String getNotificationText (){
        return Notification.getText();
    }

}
