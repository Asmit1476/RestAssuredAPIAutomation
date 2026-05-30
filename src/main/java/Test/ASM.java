package Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import java.io.File;
import java.sql.SQLOutput;

import static io.restassured.RestAssured.*;

public class ASM {

    public static void main(String[] args) {

        //RestAssured.baseURI = "https://d2bageqz8otixu.cloudfront.net/";
        RestAssured.baseURI = "https://rahulshettyacademy.com";

        String response = given().log().all().header("Content-Type","application/json")
                .body("{\n" +
                        "    \"userEmail\": \"asmitat19@gmail.com\",\n" +
                        "    \"userPassword\": \"2012Uec1476\"\n" +
                        "}")
                .when().post("/api/ecom/auth/login")
                .then().log().all().extract().response().asString();

        System.out.println("Response is: "+response);

        JsonPath js = new JsonPath(response);
        String token = js.getString("token");
        String userId = js.getString("userId");

        System.out.println("Token is: "+token);

        String productResponse = given()
                .header("authorization",token)
                .param("productName","OnePlus")
                .param("productAddedBy",userId)
                .param("productCategory","electronics")
                .param("productSubCategory","mobiles")
                .param("productPrice","35000")
                .param("productDescription","OnePlus Nord")
                .param("productFor","Human")
                .multiPart("productImage",new File("//Users//asmit//Downloads//mobile.jpeg"))
                .when().post("/api/ecom/product/add-product")
                .then().log().all().extract().response().asString();

        System.out.println("Product Response is: "+productResponse);



    }
}
