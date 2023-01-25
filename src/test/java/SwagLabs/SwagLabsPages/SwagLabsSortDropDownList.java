package SwagLabs.SwagLabsPages;

import SwagLabs.SwagLabsBase.SwagLabsBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsSortDropDownList extends SwagLabsBaseTest {
    public SwagLabsSortDropDownList() {
        PageFactory.initElements(driver, this);
    }
    @FindBy (className = "product_sort_container")
    public WebElement SortDropDownList;

    //------------------------------------------------

    public void clickOnSortDropDownList (){
        SortDropDownList.click();
    }
}
