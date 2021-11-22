package pageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HeaderPanelPage {

    @FindBy(how = How.XPATH, using = "//ul[@class='button']/li")
    public List<WebElement> list_accountServices;
}
