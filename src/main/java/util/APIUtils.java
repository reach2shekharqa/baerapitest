package util;

import static io.restassured.RestAssured.given;

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

}
