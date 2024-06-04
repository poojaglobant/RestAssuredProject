import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Assignment1Test {

    @Test
    public void getResponse() {

        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "http://localhost:3000";
        // Get the RequestSpecification of the request to be sent to the server.
        RequestSpecification httpRequest = RestAssured.given();
        // specify the method type (GET) and the parameters if any.
        //In this case the request does not take any parameters
        Response response_Posts = httpRequest.request(Method.GET, "/posts");
        Response response_Comments = httpRequest.request(Method.GET, "/comments");
        Response response_Profile = httpRequest.request(Method.GET, "/profile");
        Response response_Friends = httpRequest.request(Method.GET, "/friends");
        // Print the status and message body of the response received from the server
        // Posts API
        System.out.println("---------Posts API---------");
        System.out.println("Status received => " + response_Posts.getStatusCode());
        System.out.println("Response=>" + response_Posts.prettyPrint());

        // Comments API
        System.out.println("---------Comments API---------");
        System.out.println("Status received => " + response_Comments.getStatusCode());
        System.out.println("Response=>" + response_Comments.prettyPrint());

        // Posts API
        System.out.println("---------Profile API---------");
        System.out.println("Status received => " + response_Profile.getStatusCode());
        System.out.println("Response=>" + response_Profile.prettyPrint());

        // Comments API
        System.out.println("---------Friends API---------");
        System.out.println("Status received => " + response_Friends.getStatusCode());
        System.out.println("Response=>" + response_Friends.prettyPrint());

    }
}
