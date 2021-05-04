package ListOfArticles;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class GET_Request {
	
	@Test
	public void getArticles() {
		
		given()
		.header("Content-Type", "application/json")
		.when()
			.get("https://5f99522350d84900163b8737.mockapi.io/tech-test/articles")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat().body("[0].id", equalTo("1"))
				.and().body("[0].title", equalTo("title 1"));
	}

}
