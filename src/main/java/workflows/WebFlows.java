package workflows;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.DBActions;
import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebFlows extends CommonOps
{
    @Step("Business Flow: Login to Parabank")
    public static void Login(String user,String pass)
    {
        UIActions.updateText(parabankLogin.txt_username,user);
        UIActions.updateText(parabankLogin.txt_password,pass);
        UIActions.click(parabankLogin.btn_login);
        Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
    }

    @Step("Business Flow: Login Parabank with DB Credentials")
    public static void LoginDB()
    {
        String query = "SELECT name,password FROM Employees WHERE id = '3'";
        List<String> cred = DBActions.getCredentials(query);
        UIActions.updateText(parabankLogin.txt_username,cred.get(0));
        UIActions.updateText(parabankLogin.txt_password,cred.get(1));
        UIActions.click(parabankLogin.btn_login);
        Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
    }
    @Step("Business Flow: Update Profile")
    public static void updateProfile(String firstName,String lastName,String address,String city,String state,String zipCode)
    {
        UIActions.click(parabankBottomLeftMenu.btn_updateContactInfo);
        UIActions.doubleClick(parabankUpdateContactInfo.txt_firstName);
        UIActions.updateTextHuman(parabankUpdateContactInfo.txt_firstName,firstName);
        UIActions.doubleClick(parabankUpdateContactInfo.txt_lastName);
        UIActions.updateTextHuman(parabankUpdateContactInfo.txt_lastName,lastName);
        UIActions.doubleClick(parabankUpdateContactInfo.txt_address);
        UIActions.updateTextHuman(parabankUpdateContactInfo.txt_address,address);
        UIActions.doubleClick(parabankUpdateContactInfo.txt_city);
        UIActions.updateTextHuman(parabankUpdateContactInfo.txt_city,city);
        UIActions.doubleClick(parabankUpdateContactInfo.txt_state);
        UIActions.updateTextHuman(parabankUpdateContactInfo.txt_state,state);
        UIActions.doubleClick(parabankUpdateContactInfo.txt_zipCode);
        UIActions.updateTextHuman(parabankUpdateContactInfo.txt_zipCode,zipCode);
        UIActions.click(parabankUpdateContactInfo.btn_updateProfile);
    }
    @Step("Business Flow: Find And Verify By Transaction Date")
    public static void findAndVerifyDate(String date,String shouldExiste)
    {
        UIActions.click(parabankBottomLeftMenu.btn_findTransactions);
        UIActions.updateTextHuman(parabankFindTransactions.txt_findByDate,date);
        UIActions.click(parabankFindTransactions.btn_findTransactionsByDate);
        if (shouldExiste.equalsIgnoreCase("exists"))
            Verifications.existenceOfDate(parabankTransactionResults.rowsTransactionResults);
        else if (shouldExiste.equalsIgnoreCase("not-exists"))
        Verifications.nonExistenceOfDate(parabankTransactionResults.rowsTransactionResults);
        else
            throw new RuntimeException(("Invalid existed output option in data driven test,Should be exists or not-exists"));
    }
}
