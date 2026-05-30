package RestAssureAPI;

import io.restassured.RestAssured;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class GoogleAddPlace_ReadPayloadFromFile {
    public static void main(String[] args) throws IOException {

        // content of file i.e json to String -> convert content of the file to Bytes -> Convert Bytes to String


        RestAssured.baseURI = "https://rahulshettyacademy.com";

        given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
                .body(new String(Files.readAllBytes(Paths.get("/Users/asmit/Documents/Web Automation Template/Web_Automation_Template/Training2022/src/main/java/Files/addPlace.json"))))
                .when().post("maps/api/place/add/json")
                .then().log().all().assertThat().statusCode(200);
    }
}
