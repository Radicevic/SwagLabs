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
    public WebElement AddButton;

    @FindBy ( css = "div[class = 'inventory_details_name large_size']")
    public WebElement NameOfItem;

    //--------------------------------------------

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

    public  String getNameOfItem (){
        return NameOfItem.getText();
    }
}
