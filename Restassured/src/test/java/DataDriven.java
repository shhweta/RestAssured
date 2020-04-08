import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import demo.Datafunction;
import io.restassured.http.ContentType;

public class DataDriven extends Datafunction{
	
	
	
	@Test(dataProvider = "dataforPost")
		public void post(String name,String email,String avatar, int key) 
	   {
		JSONObject req= new JSONObject();
		
		req.put("name", name);
		req.put("email",email);
		req.put("avatar", avatar);
		req.put("key", key);
		
		baseURI="http://localhost:3000";
		
		given().
		contentType(ContentType.JSON).accept(ContentType.JSON).
		header("Content-type","application/json").
		body(req.toJSONString()).
		when().
		post("/data").
		then().statusCode(201).log().all();
		
		} 

		
		
		
		
		//@Test(dataProvider = "deletefordat")
		public void delete(int id) 
		
		{
		JSONObject req= new JSONObject();
		
			
		baseURI="http://localhost:3000";
		
		
		when().
		delete("/data/"+id).
		then().statusCode(200).log().all();
		}
}
