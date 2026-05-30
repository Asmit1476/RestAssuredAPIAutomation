package VymoAPITesting;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class AddPolicyAPI {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://staging.lms.getvymo.com/";

        String name = RandomStringUtils.randomAlphabetic(5);
        String policyName = name + "Policy";

        String policyNumber = RandomStringUtils.randomAlphanumeric(6);

        String str = given().header("Content-Type","application/json").queryParam("request-type","sync")
                .header("auth-key","ec28ccbafbc2c53bcc711ab387cb7437a5209d0eb1300e8c6a4e3a96f42d1f41")
                .header("client","njm")
                .body(Payload.getPolicyPayload(policyName,policyNumber))
                .when().post("/api/v1/push/vymoObjects")
                .then().log().all().assertThat().statusCode(200).extract().response().asString();

        JsonPath js = new JsonPath(str);
        String msg = js.getString("success");
        Assert.assertEquals(msg,"Successfully saved");

    }


}
