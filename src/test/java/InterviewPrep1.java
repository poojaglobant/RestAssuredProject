import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class InterviewPrep1 {

    @Test
    public void jsonValue(){
        //base URL
        RestAssured.baseURI = "http://localhost:3000";

        //GET operation
        Response response = given()
                .when()
                .get("/jkopopo");

        //Validate through JSON
        JsonPath jsonPath = new JsonPath(response.asString());
        String title = jsonPath.getString("book[1].title");
    }

    @Test
    public void responseAssertion(){

        //base url
        RestAssured.baseURI = "https://abc.com";

        //GET operation
        given()
                .when()
                .get("/bjkjkpo324-jbjkjo23-32fnjn")
                .then().log().all()

        //verify status code
                .assertThat().statusCode(200)

        //verify body
                .body("book[1].title",Matchers.equalTo("Sword of Honour"))

        //verify header
                .header("Content-Length","57");
    }

    @Test
    public void verifyTestNg(){
        String input = "Sword of Honour";

        //base url
        RestAssured.baseURI = "https://abc.com";

        //input details
        RequestSpecification httpMethod = RestAssured.given();

        //get response
        Response response = httpMethod.get("/bjkjkpo324-jbjkjo23-32fnjn");

        //response body
        ResponseBody body = response.getBody();

        //convert response body to string
        String b = body.asString();

        //json representation from response body
        JsonPath jsonPath = response.jsonPath();
        String output = jsonPath.getString("book[1].title");
        Assert.assertEquals(input,output);
    }

    @Test
    public void getResponseAsString(){
        //base url
        RestAssured.baseURI = "https://abc.com";

        String response = RestAssured.given().when()

        //get request
                .get("/bjkjkpo324-jbjkjo23-32fnjn")

        //get response as a string
                .then().extract().response().asString();

        System.out.println(response);
    }

    @Test
    public void getPriceOfEachBook(){

        RestAssured.baseURI = "https://abc.com";

        Response response = given().when().get("/bjkjkpo324-jbjkjo23-32fnjn");
        JsonPath jsonPath = new JsonPath(response.asString());

        float sum = 0;

        for (int i=0; i<=3; i++){
            String title = jsonPath.getString("book[i].title");
            float price = jsonPath.getFloat("book[i].price");

            System.out.println("Price of book '" + title + "' is : " + price);
            sum = sum + price;
        }

        System.out.println("Sum of all books price is : " + sum);
    }
}
