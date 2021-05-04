package SingleArticle;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

public class DELETE_Request {
	@Test
	public void deleteArticle() {
		
		given()
		.header("Content-Type", "application/json")
		.when()
		.delete("https://5f99522350d84900163b8737.mockapi.io/tech-test/articles/2")
		.then()
			.statusCode(404)
			.statusLine("HTTP/1.1 404 Not Found")
			.assertThat().body(equalTo("\"Endpoint disabled\""))
			.log().all();
	}
}
