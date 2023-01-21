package SwagLabs.SwagLabsPages;

import SwagLabs.SwagLabsBase.SwagLabsBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SwagLabsItemsPage extends SwagLabsBaseTest {
    public SwagLabsItemsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (className = "inventory_item_name")
    public List<WebElement> InventoryItems;

    @FindBy (css = ".btn.btn_primary.btn_small.btn_inventory")
    public WebElement AddButton;  // Add button when we click on item

    @FindBy ( css = "div[class = 'inventory_details_name large_size']") // Name item when we click on them
    public WebElement NameOfItem;

    @FindBy (id = "add-to-cart-sauce-labs-backpack")
    public WebElement FirstItemOnHomePage;

    @FindBy (id = "add-to-cart-sauce-labs-bike-light")
    public WebElement SecondItemOnHomePage;

    @FindBy (id = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement ThirdItemOnHomePage;

    @FindBy (id = "add-to-cart-sauce-labs-fleece-jacket")
    public WebElement FourthItemOnHomePage;

    @FindBy (id = "add-to-cart-sauce-labs-onesie")
    public WebElement FifthItemOnHomePage;

    @FindBy (id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    public WebElement SixthItemOnHomePage;

    @FindBy (className = "inventory_item_name")
    public List<WebElement> NamesOfItemsInCart;



    //-------------------FIRST CLICK ON ITEM AND THEN ADD TO CART-------------------------

    public void clickOnAddButton (){
        AddButton.click();
    }

    public void clickOnItemOne (){
        InventoryItems.get(0).click();
    }
    public void clickOnItemTwo (){
        InventoryItems.get(1).click();
    }
    public void clickOnItemThree (){
        InventoryItems.get(2).click();
    }
    public void clickOnItemFour (){
        InventoryItems.get(3).click();
    }
    public void clickOnItemFive (){
        InventoryItems.get(4).click();
    }
    public void clickOnItemSix (){
        InventoryItems.get(5).click();
    }

    //----------------ADD TO CART DIRECT FROM HOME PAGE------------------------
    public void addFirstItemFromHomePage(){
        FirstItemOnHomePage.click();
    }
    public void addSecondItemFromHomePage(){
        SecondItemOnHomePage.click();
    }
    public void addThirdItemFromHomePage(){
        ThirdItemOnHomePage.click();
    }
    public void addFourthItemFromHomePage(){
        FourthItemOnHomePage.click();
    }
    public void addFifthItemFromHomePage(){
        FifthItemOnHomePage.click();
    }
    public void addSixthItemFromHomePage(){
        SixthItemOnHomePage.click();
    }
    //-------------Name item when we click on them--------------------------------

    public  String getNameOfItem (){
        return NameOfItem.getText();
    }

    //-------------Name items in cart--------------------------------

    public  String getNameOfFirstItem (){
        return NamesOfItemsInCart.get(0).getText();
    }

    public  String getNameOfSecondItem (){
        return NamesOfItemsInCart.get(1).getText();
    }

    public  String getNameOfThirdItem (){
        return NamesOfItemsInCart.get(2).getText();
    }

    public  String getNameOfFourthItem (){
        return NamesOfItemsInCart.get(3).getText();
    }

    public  String getNameOfFifthItem (){
        return NamesOfItemsInCart.get(4).getText();
    }

    public  String getNameOfSixthItem (){
        return NamesOfItemsInCart.get(5).getText();
    }

}
