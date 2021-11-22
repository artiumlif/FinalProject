package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.DesktopFlows;


@Listeners(utilities.Listeners.class)
public class CalculatorDesktop extends CommonOps {

    @Test(description = "Test01 - Verify addition command")
    @Description("This test performs addition operation and verifies it")
    public void Test01_VerifyAdditionCommand()
    {
        DesktopFlows.calculateAddition();
        Verifications.VerifyTextInElement(calcMain.field_result, "Display is 3");
    }
}
