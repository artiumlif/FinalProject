package pageObjects.parabank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class TransactionResultsPage
{
    @FindBy(how = How.XPATH, using = "//*[@id='transactionTable']/tbody/tr[1]")
    public List<WebElement> rowsTransactionResults;
}
