package extensions;

import io.qameta.allure.Step;
import org.testng.annotations.Test;
import utilities.CommonOps;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBActions extends CommonOps {

    @Step("Get Credentials for Database")
    public static List<String> getCredentials (String query){
        List <String> Credentials = new ArrayList<>();
        try {
            rs = stat.executeQuery(query);
            rs.next();
            Credentials.add(rs.getString(1));
            Credentials.add(rs.getString(2));

        } catch (Exception e) {
            System.out.println("Error Occurred While Printing Table Data,See Details: " + e);
        }
        return Credentials;
    }
}
