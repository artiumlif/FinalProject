package sanity;


import com.google.common.util.concurrent.Uninterruptibles;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ElectronFlows;

import java.util.concurrent.TimeUnit;

@Listeners(utilities.Listeners.class)
public class TodoListElectron extends CommonOps {

    @Test(description = "Test01 - Add and Verify New Task")
    @Description("This test adds a new task and verifies it in the list of tasks")
    public void Test01_AddAndVerifyNewTask()
    {
        ElectronFlows.addNewTask("Learn Java");
        Verifications.verifyNumber(ElectronFlows.getNumberOfTasks(), 1);

        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }
}
