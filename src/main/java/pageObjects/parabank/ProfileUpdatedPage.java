package pageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfileUpdatedPage {

    @FindBy(how = How.XPATH, using = "//*[@id='rightPanel']/div/div/p")
    public WebElement txt_Confirmaupdatingdetailse;
}
