package SingleArticle;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

public class GET_Request {
	@Test
	public void getArticle() {
		
		given()
		.header("Content-Type", "application/json")
		.when()
			.get("https://5f99522350d84900163b8737.mockapi.io/tech-test/articles/2")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat().body("id", equalTo("2"))
				.and().body("title", equalTo("title 2"))
				.and().body("image.url", equalTo("https://imgur.com"));
	}
}
