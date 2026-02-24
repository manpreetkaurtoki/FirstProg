import org.apache.http.auth.AUTH;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Test_Auth {
	
	
	@Test
	public void Test_Auth()
	{
		// static is mentioned to directly used the RestAssured class data
		//RestAssured.baseURI = "https://postman-echo.com/basic-auth";
		baseURI="https://postman-echo.com/basic-auth";
		given().auth().basic("postman","password").
			when().get(baseURI).
			then().
		statusCode(200).body("authenticated", equalTo(true));
		
		
	}

}
