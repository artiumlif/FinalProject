package pageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AccountsOverviewPage {
    @FindBy(how = How.CLASS_NAME, using = "title")
    public WebElement head_Accountsoverview;

    @FindBy(how = How.XPATH, using = "//tr[@ng-repeat='account in accounts'][1]")
    public List <WebElement> rows;
}
