package EX03_Get_request;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class ApiTesting07_Get_BDDStyle {

    @Test
    public void get_bdd_postive(){
        String pincode="560037";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);
    }
    @Test
    public void get_Bdd_negative(){
        String pincode="-1";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);
    }
}
