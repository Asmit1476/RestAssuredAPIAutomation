package Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Home {

//    https://api.github.com/search/repositories?q=org:BigBasket&type=all
//    q:org:BigBasket
//    type:all
//    Authorization:Basic BBBBBBBB2Q6Z2hwXzRMOXJrTzdOOOOhhggvfreerere986544

    public static void main(String[] args) {

        RestAssured.baseURI = "https://api.github.com";

        String response = given().log().all().queryParam("q","org:BigBasket")
                .queryParam("type","all")
                .header("Authorization","Basic BBBBBBBB2Q6Z2hwXzRMOXJrTzdOOOOhhggvfreerere986544")
                .when().get("/search/repositories")
                .then().log().all().assertThat().statusCode(200).extract().response().asString();

        System.out.println("Response is: "+response);
    }
}
