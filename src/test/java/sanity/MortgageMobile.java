package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.MobileFlows;

@Listeners(utilities.Listeners.class)
public class MortgageMobile extends CommonOps {

    @Test(description = "Test03 - Verify mortgage")
    @Description("This test fill in mortgage fields and calculate repayment")
    public void Test01_verifyMortgage()
    {
        MobileFlows.calculateMortgage("125000","10","4");
        Verifications.VerifyTextInElement(mortgageMain.txt_repayment,"£1284.28");
    }

}
