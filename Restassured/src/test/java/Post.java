import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class Post {
	
	@Test
	public void test_post() {
		
//		Map<String, Object> map = new HashMap<String, Object>();
//		
//		map.put("name", "ARGS");
//		map.put("job", "Worrk");
//		
//		System.out.println(map);
		
		JSONObject request =new JSONObject();
		
		request.put("name", "john");
		request.put("job", "work");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		 given().
		 	header("Content-Type", "application/json").
		 	body(request.toJSONString()).
		 when().
		 	post("https://reqres.in/api/users").
		 then().
		 	statusCode(201);
	}

}
