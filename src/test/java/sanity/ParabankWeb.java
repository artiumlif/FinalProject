package sanity;


import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

@Listeners(utilities.Listeners.class)
public class ParabankWeb extends CommonOps {
    @Test(description = "Test01 - Verify booking")
    @Description("This test login and verify the header of the page")
    public void Test01_verifyBooking()
    {
        WebFlows.Login("john","demo");
        Verifications.VerifyTextInElement(parabankAccountsOverview.head_Accountsoverview,"Accounts Overview");
    }

//    @Test(description = "Test02 - Verify accounts")
//    @Description("This test verify the default users")
//    public void Test02_verifyAccounts()
//    {
//        UIActions.mouseHover(parabankBottomLeftMenu.btn_openneWaccount,parabankBottomLeftMenu.btn_accountsOverview);
//        Verifications.numberOfElements(parabankAccountsOverview.rows,1);
//    }
//
//    @Test(description = "Test03 - Verify profile updated")
//    @Description("This test updates profile details and verify the text is written")
//    public void Test03_verifyProfileUpdated()
//    {
//        WebFlows.updateProfile("Artium","Lifshitz","yosef shprintsak street 1","Petah Tikva","Israel","49531");
//        Verifications.varifyProfileUpdated(parabankProfileUpdated.txt_Confirmaupdatingdetailse,"Your updated address and phone number have been added to the system.");
//    }
//
//    @Test(description = "Test04 - Verify account services")
//    @Description("This test verify the account services are displayed (using soft assertion)")
//    public void Test04_verifyAccountServices()
//    {
//        Verifications.visibiltiyOfElement(parabankHeaderPanel.list_accountServices);
//    }
//
//    @Test(description = "Test05 - Verify logo")
//    @Description("This test verify the logo of the company using Sikuli tool")
//    public void Test05_verifyLogo()
//    {
//        Verifications.visualElement ("ParabankLogo");
//    }
//
//    @Test(description = "Test07 - Search Date", dataProvider = "data-provider-dates",dataProviderClass = utilities.ManageDDT.class)
//    @Description("This test search transactions by date")
//    public void Test07_searchDate(String date,String shouldExiste)
//    {
//        WebFlows.findAndVerifyDate(date,shouldExiste);
//    }
}
