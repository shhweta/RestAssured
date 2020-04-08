import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.* ;
import org.json.simple.JSONObject;


public class temp_server {
	
	@Test
	public void server() {
		
		baseURI="http://localhost:3000";
		
		given().param("name", "Lawson").
		get("/data").
		then().statusCode(200).log().all();
		
	}
	
	
	
	//@Test
	public void post() {
	JSONObject req= new JSONObject();
	
	req.put("name", "sheldon");
	req.put("email","sheldon@gg.com");
	req.put("avatar", "https://s3.amazonaws.com/uifaces");
	req.put("key", 7);
	
	baseURI="http://localhost:3000";
	
	given().
	contentType(ContentType.JSON).accept(ContentType.JSON).
	header("Content-type","application/json").
	body(req.toJSONString()).
	when().
	post("/data").
	then().statusCode(201).log().all();
	
	}
	
	
	//@Test
	public void patch() {
	JSONObject req= new JSONObject();
	
	
	req.put("email","sssheldon@gg.com");
	
	
	baseURI="http://localhost:3000";
	
	given().
	contentType(ContentType.JSON).accept(ContentType.JSON).
	header("Content-type","application/json").
	body(req.toJSONString()).
	when().
	patch("/data/11").
	then().statusCode(200).log().all();
	
	}
	
	//@Test
	public void put() {
	JSONObject req= new JSONObject();
	
	req.put("name", "cooper");
	req.put("email","coopheldon@gg.com");
	req.put("avatar", "https://s3.amazonaws.com/uifaces");
	req.put("key", 7);
	
	baseURI="http://localhost:3000";
	
	given().
	contentType(ContentType.JSON).accept(ContentType.JSON).
	header("Content-type","application/json").
	body(req.toJSONString()).
	when().
	put("/data/10").
	then().statusCode(200).log().all();
	
	}
	
	
	@Test
	public void delete() {
	JSONObject req= new JSONObject();
	
	baseURI="http://localhost:3000";
	
	
	when().
	delete("/data/11").
	then().statusCode(200).log().all();
	
	
	
	
	}
}
