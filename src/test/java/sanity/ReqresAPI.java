package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ApiFlows;


@Listeners(utilities.Listeners.class)
public class ReqresAPI extends CommonOps {

    @Test(description = "Test 01: Get id From Reqres")
    @Description("This test Verify id profile")
    public void test01_Verifyid() {
        Verifications.verifyText(ApiFlows.getListOfUsers("data[0].id"),"7");
    }

    @Test(description = "Test 02: Add user and Verify")
    @Description("This test adds a user to reqres and Verify it")
    public void test02_addUserAndVerify() {
        ApiFlows.postUser("shmulik", "Interior designer");
        Verifications.verifyText(ApiFlows.getListOfUsers("data[1].id"),"8");
    }

    @Test(description = "Test 02: Update user and Verify")
    @Description("This test update a user in reqres and Verify it")
    public void test02_updateUserAndVerify() {
        ApiFlows.putUser("moshe", "Structural Engineering","8");
        Verifications.verifyText(ApiFlows.getListOfUsers("data[1].id"),"8");
    }

    @Test(description = "Test 02: Delete user and Verify")
    @Description("This test delete a user in reqres and Verify it")
    public void test02_deleteUserAndVerify() {
        ApiFlows.deleteUser("8");
        Verifications.verifyText(ApiFlows.getListOfUsers("data[1].id"),"8");
    }

}
