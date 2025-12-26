package basic_Requests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matcher;

import io.restassured.RestAssured;

public class GetUserTest {

    @org.testng.annotations.Test
   public void getUser() {
    	 RestAssured.useRelaxedHTTPSValidation();
    	String email = given()
            .baseUri("https://reqres.in")
            .header("x-api-key", "YOUR_API_KEY")
            .log().all()
        .when()
            .get("/api/users/2")
        .then()
            .statusCode(200)
            .extract()
            .path("data.email");
           
    	 	
    	 System.out.println(email);	
        
    	 
    }


    
}
