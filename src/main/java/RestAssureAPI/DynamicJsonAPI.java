package RestAssureAPI;

import APIUtility.ConvertRawToJSON;
import APIUtility.PayLoad;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicJsonAPI {

    @Test(dataProvider = "BookData")
    public void addBook(String isbn, String aisle){

        RestAssured.baseURI = "https://rahulshettyacademy.com";

        String resp = given().log().all().header("Content-Type","application/json")
                .body(PayLoad.addBook(isbn,aisle)) //passing the value of isbn and aisle key at runtime
                .when().post("/Library/Addbook.php")
                .then().assertThat().statusCode(200).extract().response().asString();

        System.out.println(resp);

        JsonPath js = ConvertRawToJSON.rawToJson(resp);


        String id = js.get("ID");
        System.out.println("ID is: "+id);


        // Delete Book API
        String deleteResponse = given().header("Content-Type","application/json")
                .body(PayLoad.deleteBook(id))
                .when().delete("Library/DeleteBook.php")
                .then().assertThat().statusCode(200).extract().response().asString();

        System.out.println("Delete Response: "+deleteResponse);

    }

    @DataProvider(name = "BookData")
    public Object[][] getData(){

        return new Object[][] {{"bdce","3455"},{"afafa","2587"},{"sfsf","9876"}};
    }



}
