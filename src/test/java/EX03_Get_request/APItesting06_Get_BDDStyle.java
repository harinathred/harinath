package EX03_Get_request;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APItesting06_Get_BDDStyle {

    @Test
    public void Get_Bdd(){
        String pincod="560037";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincod)
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }

    @Test
    public void test_BDD_GET(){
        String pincode = "560016";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }
}
