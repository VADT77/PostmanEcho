package classes;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PostmanEchoTest {
    @Test
    public void PostmanEchoTest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("ПостманЭхотест ")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("ПостманЭхотест "));
    }
}