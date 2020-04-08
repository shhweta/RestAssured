import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Second {
	
	@Test
	public void Test_Get() {
		
		given(). 
			get("https://reqres.in/api/users?page=2").
			then().
			statusCode(200).
			body("data.id[1]",equalTo(8)).
			body("data.first_name", hasItems("Tobias","Byron")).
			log().all();
	}

}
