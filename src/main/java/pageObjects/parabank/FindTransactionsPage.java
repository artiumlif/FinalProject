package pageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindTransactionsPage
{
    @FindBy(how = How.ID, using = "criteria.onDate")
    public WebElement txt_findByDate;

    @FindBy(how = How.XPATH, using = "//*[@id='rightPanel']/div/div/form/div[5]/button")
    public WebElement btn_findTransactionsByDate;
}
