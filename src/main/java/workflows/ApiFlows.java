package workflows;

import extensions.ApiActions;
import io.qameta.allure.Step;
import utilities.CommonOps;


public class ApiFlows extends CommonOps {

    @Step("Business Flow: Get Id Property")
    public static String getListOfUsers(String JPath){
        response = ApiActions.get("sers?page=2");
        return ApiActions.extractFromJSON(response,JPath);
    }

    @Step("Business Flow: Create New User, In Reqres")
    public static void postUser(String name,String job){
        params.put("name",name);
        params.put("job",job);
        ApiActions.post(params,"users/8");
    }

    @Step("Business Flow: Update New User, In Reqres")
    public static void putUser(String name,String job,String id){
        params.put("name",name);
        params.put("job",job);
        ApiActions.put(params,"users/" + id);
    }

    @Step("Business Flow: Delete User, From Reqres")
    public static void deleteUser(String id){
        ApiActions.delete(id);
    }
}
