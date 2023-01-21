package SwagLabs.SwagLabsPages;

import SwagLabs.SwagLabsBase.SwagLabsBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsShoppingCartPage extends SwagLabsBaseTest {
    public SwagLabsShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "shopping_cart_container")
    public WebElement ShoppingCart;

    //------------------------------------------------

    public void clickOnShoppingCart (){
        ShoppingCart.click();
    }
}
