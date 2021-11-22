package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

@Listeners(utilities.Listeners.class)
public class ParabankDB extends CommonOps {
        @Test(description = "Test01 - Login Parabank with DB Credentials")
        @Description("This test login with DB Credentials and verify the header of the page")
        public void Test01_loginDBAndVerifyHeader() {
            WebFlows.LoginDB();
            Verifications.VerifyTextInElement(parabankAccountsOverview.head_Accountsoverview, "Accounts Overview");
        }
    }

