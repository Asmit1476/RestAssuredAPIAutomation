package RestAssureAPI;

import APIUtility.ConvertRawToJSON;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class GoogleAddPlace_ValidateResponse {

    public static void main(String[] args) {

        String payLoad = "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Frontline house\",\n" +
                "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                "  \"address\": \"29, side layout, cohen 09\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}";

        String expectedAddress = "Jamalpur,Bihar";


        RestAssured.baseURI = "https://rahulshettyacademy.com";


        //POST API Call
        String response = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
                .body(payLoad)
                .when().post("maps/api/place/add/json")
                .then().assertThat().statusCode(200).body("scope",equalTo("APP"))
                .header("server",equalTo("Apache/2.4.41 (Ubuntu)")).extract().response().asString();

        System.out.println("Response is: "+response);

        JsonPath js = new JsonPath(response); // for parsing JSON
        String place_id= js.getString("place_id");

        System.out.println("Place Id is: "+place_id);





        //PUT API Call
        given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
                .body("{\n" +
                        "\"place_id\":\""+place_id+"\",\n" +
                        "\"address\":\""+expectedAddress+"\",\n" +
                        "\"key\":\"qaclick123\"\n" +
                        "}")
                .when().put("maps/api/place/update/json")
                .then().log().all().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated"));


        //GET API Call

        String getResponse = given().log().all().queryParam("key","qaclick123")
        .queryParam("place_id",place_id)
                .when().get("maps/api/place/get/json")
                .then().log().all().assertThat().statusCode(200).extract().response().asString();

        JsonPath js1 = ConvertRawToJSON.rawToJson(getResponse) ; // for parsing JSON
        String actual_address = js1.getString("address");

        System.out.println("Expected Address is: "+actual_address);

        Assert.assertEquals(expectedAddress,actual_address);
    }
}
