package Helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class TempAPI {
    RequestSpecification httpRequest;
    Response response;
    String url = "https://reqres.in/api";

    @Test
    public void testingAPI () {
        RestAssured.baseURI = url;
        httpRequest = RestAssured.given();

        // Get Request
      response = httpRequest.get("/users?page=2");

        // Post + Put Request
        JSONObject params = new JSONObject();
        params.put("name","shmulik");
        params.put("job","Interior designer");

//        httpRequest.header("Content-Type","application/json");
//
//        httpRequest.body(params.toJSONString());
//        response = httpRequest.post("/users/2");

//          response = httpRequest.delete("/users/8");

        response.prettyPrint();
    }

}
