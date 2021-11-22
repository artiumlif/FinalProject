package pageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BottomLeftMenuPage
{
    @FindBy(how = How.XPATH, using = "//*[@id='leftPanel']/ul/li[1]/a")
    public WebElement btn_openneWaccount;

    @FindBy(how = How.XPATH, using = "//*[@id='leftPanel']/ul/li[2]/a")
    public WebElement btn_accountsOverview;

    @FindBy(how = How.XPATH, using = "//*[@id='leftPanel']/ul/li[3]/a")
    public WebElement btn_transferFunds;

    @FindBy(how = How.XPATH, using = "//*[@id='leftPanel']/ul/li[4]/a")
    public WebElement btn_billPay;

    @FindBy(how = How.XPATH, using = "//*[@id='leftPanel']/ul/li[5]/a")
    public WebElement btn_findTransactions;

    @FindBy(how = How.XPATH, using = "//*[@id='leftPanel']/ul/li[6]/a")
    public WebElement btn_updateContactInfo;
}
