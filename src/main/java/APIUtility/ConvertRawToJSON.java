package APIUtility;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;

public class ConvertRawToJSON {

    public static JsonPath rawToJson(String response){

        JsonPath js = new JsonPath(response);

        return js;
    }
}
