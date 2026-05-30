package Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import static io.restassured.RestAssured.*;

public class SslLab {
    public static void main(String[] args) {

        RestAssured.baseURI = "https://api.ssllabs.com/api/v3/";

        //Invoke assessment and check progress
       String response= given().queryParam("host","www.codecrafttech.com")
                .queryParam("publish","on")
//                .queryParam("startNew","on")
//                .queryParam("fromCache","off")
//                .queryParam("all","on")
//                .queryParam("ignoreMismatch","on")

                .when().get("analyze")
                        .then().log().all().assertThat().statusCode(200).extract().response().asString();

        System.out.println("Response is: "+response);

        JsonPath js = new JsonPath(response);

        String expectedStatus= "READY";
        String actualStatus = js.getString("status");
        System.out.println("Status: "+actualStatus);
        Assert.assertEquals(expectedStatus,actualStatus);


        String grade = js.getString("endpoints[0].grade");
        System.out.println("Grade: "+grade);

        String gradeTrustIgnored = js.getString("endpoints[0].gradeTrustIgnored");
        System.out.println("Grade Trust Ignored: "+gradeTrustIgnored);


        //Retrieve detailed endpoint information
        String detailedResponse= given().queryParam("host","www.codecrafttech.com")
                .queryParam("s","166.62.26.21")
//                .queryParam("startNew","on")
//                .queryParam("fromCache","off")
//                .queryParam("all","on")
//                .queryParam("ignoreMismatch","on")

                .when().get("getEndpointData")
                .then().log().all().assertThat().statusCode(200).extract().response().asString();

        System.out.println("Response is: "+detailedResponse);

//        JsonPath js = new JsonPath(response);
//        String grade = js.getString("endpoints[0].grade");
//        System.out.println("Grade: "+grade);
//
//        String gradeTrustIgnored = js.getString("endpoints[0].gradeTrustIgnored");
//        System.out.println("Grade Trust Ignored: "+gradeTrustIgnored);

    }
}
