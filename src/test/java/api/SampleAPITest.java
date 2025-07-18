package api;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SampleAPITest {

    @Test
    public void testGetRequest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        
        given().
        when().
            get("/posts/1").
        then().
            assertThat().
            statusCode(200).
            body("userId", equalTo(1));
    }
}
