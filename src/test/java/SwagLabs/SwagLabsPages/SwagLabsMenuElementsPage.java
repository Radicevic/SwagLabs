package SwagLabs.SwagLabsPages;

import SwagLabs.SwagLabsBase.SwagLabsBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsMenuElementsPage extends SwagLabsBaseTest {
    public SwagLabsMenuElementsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "react-burger-menu-btn")
    public WebElement MenuButton;

    @FindBy (id = "inventory_sidebar_link")
    public WebElement AllItemsButton;

    @FindBy (id = "about_sidebar_link")
    public WebElement AboutButton;

    @FindBy (id = "logout_sidebar_link")
    public WebElement LogoutButton;

    @FindBy (id = "reset_sidebar_link")
    public WebElement ResetAppStateButton;

    @FindBy (id = "react-burger-cross-btn")
    public WebElement CloseButton;

    //--------------------------------------------

    public void clickOnManuButton (){
        MenuButton.click();
    }

    public void clickOnAllItemsButton (){
        AllItemsButton.click();
    }

    public void clickOnAboutButton (){
        AboutButton.click();
    }

    public void clickOnLogoutButton (){
        LogoutButton.click();
    }

    public void clickOnResetAppStateButton (){
        ResetAppStateButton.click();
    }

    public void clickOnCloseButton (){
        CloseButton.click();
    }
}
