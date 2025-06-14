package util;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APIUtils {

    private final ConfigManager cm;

    public APIUtils(ConfigManager cm) {

        this.cm = cm;

    }

    public Response buildRequestForGet(String endpoint) {

        System.out.println(cm.get("base.url"));

        return given()

                .baseUri(cm.get("base.url"))
                .header("x-api-key", cm.get("x-api-key"))
                .log()
                .all()
                .get(endpoint);
    }

    public Response buildRequestForPost(String endpoint, String filepath) throws IOException {

        //System.out.println(cm.get("base.url"));
        String finalfilepath = System.getProperty("user.dir") + "/src/main/java/resources/requestBody/" + filepath + ".json";
        //System.out.println(finalfilepath);

        return given()

                .baseUri(cm.get("base.url"))
                .contentType(ContentType.JSON)
                .header("x-api-key", cm.get("x-api-key"))
                .body(RandomUtils.readJsonAndgetAsString(finalfilepath))
                .post(endpoint);
    }

}
