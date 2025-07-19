import io.qameta.allure.*;

@Epic("Sample API Tests")
@Feature("GET Posts")
public class SampleAPITest {

    @Test(description = "Verify GET /posts/1 returns status 200 and correct userId")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Get single post")
    @Description("Validates the response of GET /posts/1")
    public void testGetRequest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        
        given().
        when().
            get("/posts/1").
        then().
            statusCode(200).
            body("userId", equalTo(1));
    }
}
