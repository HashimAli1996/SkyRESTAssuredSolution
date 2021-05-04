package ListOfArticles;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GET_RequestResponseTime {
	
	TimeUnit seconds = TimeUnit.SECONDS;
	
	@Test
	public void getResponseTime() {
		Response response = get("https://5f99522350d84900163b8737.mockapi.io/tech-test/articles");
		
		Assert.assertTrue((response.getTimeIn(seconds) < 3), "Response took longer than 3 seconds");
		
	}

}
