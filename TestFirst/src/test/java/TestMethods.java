import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class TestMethods {
	
	@Test
	public void test_1()
	{
		given().
		header("Content-Type", "application/json").
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).
		body("data.id[0]",equalTo(7)).
		body("data.first_name", hasItems("Michael","Lindsay"));
	}
	
	@Test
	public void test_2()
	{
		//By creating Map (It's not JSON can be "\" )
		/*
		 * Map<String, Object> map = new HashMap<String,Object>(); map.put("name",
		 * "Toki"); map.put("job", "Teacher"); System.out.println(map);
		 */
	
		//By creating JSonObject 
		//JSONObject request = new JSONObject(map);
		
		JSONObject request =new JSONObject();
		request.put("name", "Toki");
		request.put("job", "Tester");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		//Api call for Post a JSONObject in body
		given().
		headers("Content-Type","application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().statusCode(201);
		
	}
	
	
	//PUT MEthod
	@Test
	public void test_03()
	{
		JSONObject request =new JSONObject();
		request.put("name", "Toki");
		request.put("job", "Tester");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		//Api call for Post a JSONObject in body
		given().
		headers("Content-Type","application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().statusCode(200).log().all();
		
	}
	
	//PATCH MEthod
	@Test
	public void test_04()
	{
		JSONObject request =new JSONObject();
		request.put("name", "Toki");
		request.put("job", "Tester");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		//Api call for Post a JSONObject in body
		given().
		headers("Content-Type","application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		patch("https://reqres.in/api/users/2").
		then().statusCode(200).log().all();
	}

	//Delete method
	@Test
	public void test_05()
	{
		
		when().
		delete("https://reqres.in/api/users/2").
		then().statusCode(204).log().all();
	}

}
