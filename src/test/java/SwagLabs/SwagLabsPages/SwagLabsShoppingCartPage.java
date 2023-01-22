package SwagLabs.SwagLabsPages;

import SwagLabs.SwagLabsBase.SwagLabsBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SwagLabsShoppingCartPage extends SwagLabsBaseTest {

    public SwagLabsShoppingCartPage() {PageFactory.initElements(driver, this);}

    @FindBy (id = "shopping_cart_container")
    public WebElement ShoppingCart;

    @FindBy ( className = "inventory_item_name")
    public WebElement NameOfItemInCart;   //When we click on item and then add to cart

    @FindBy ( id = "continue-shopping")
    public WebElement ContinueToShoppingButton;

    @FindBy ( id = "checkout")
    public WebElement Checkout;

    @FindBy (id = "remove-sauce-labs-backpack")
    public WebElement Remove;


    //------------------------------------------------

    public void clickOnShoppingCartButton (){
        ShoppingCart.click();
    }
    public  String getNameOfItemInCart (){
        return NameOfItemInCart.getText();   //When we click on item and then add to cart
    }

    public  String getNumberOfItemSInCart (){
        return ShoppingCart.getText();   //Number of items in cart
    }

    public void clickToContinueToShoppingButton (){
        ContinueToShoppingButton.click();
    }

    public void clickToCheckoutButton (){
        Checkout.click();
    }

    public void clickOnRemoveButton (){
        Remove.click();
    }
}

