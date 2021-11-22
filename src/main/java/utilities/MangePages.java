package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.parabank.*;

public class MangePages extends Base{


    public static void initParabank()
    {
        parabankLogin = PageFactory.initElements(driver,pageObjects.parabank.LoginPage.class);
        parabankAccountsOverview = PageFactory.initElements(driver, AccountsOverviewPage.class);
        parabankBottomLeftMenu = PageFactory.initElements(driver,pageObjects.parabank.BottomLeftMenuPage.class);
        parabankUpdateContactInfo = PageFactory.initElements(driver,pageObjects.parabank.UpdateContactInfoPage.class);
        parabankProfileUpdated = PageFactory.initElements(driver, ProfileUpdatedPage.class);
        parabankHeaderPanel = PageFactory.initElements(driver, HeaderPanelPage.class);
        parabankFindTransactions = PageFactory.initElements(driver, FindTransactionsPage.class);
        parabankTransactionResults = PageFactory.initElements(driver, TransactionResultsPage.class);
    }

    public static void initMortgage()
    {
        mortgageMain = new pageObjects.mortgage.MainPage(mobileDriver);
    }

    public static void initTodo()
    {
        todoMain = PageFactory.initElements(driver, pageObjects.todo.MainPage.class);
    }

    public static void initCalculator()
    {
        calcMain = PageFactory.initElements(driver, pageObjects.calculator.MainPage.class);
    }
}
