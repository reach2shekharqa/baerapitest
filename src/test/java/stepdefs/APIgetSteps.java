package stepdefs;

import java.util.List;
import java.util.Map;

import context.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import util.APIUtils;

public class APIgetSteps {

    private final APIUtils apiUtils;
    private final TestContext testContext;

    public APIgetSteps(APIUtils apiUtils, TestContext testcontext) {

        this.apiUtils = apiUtils;
        this.testContext = testcontext;

    }

    @Given("I make a GET call to {string}")
    public void i_make_a_get_call_to(String endpoint) {
        System.out.println("Thread: " + Thread.currentThread().getName() + " executing scenario: " + endpoint);

        Response response = apiUtils.buildRequestForGet(endpoint);

        testContext.set("response", response);

    }

    @Then("the response status code should be {string}")
    public void the_response_status_code_should_be(String statusCode) {
        Response r = (Response) testContext.get("response");

        r.prettyPrint();

        r.then().statusCode(Integer.valueOf(statusCode));

    }

    @Given("I make a GET call to endpoint it shoud be success")
    public void i_make_a_get_call_to_endpoint_it_shoud_be_success(DataTable dataTable) {

        List<Map<String, String>> getS = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> value : getS) {

            System.out.println(value.get("endpoint"));
            System.out.println(value.get("statusCode"));

            apiUtils.buildRequestForGet(value.get("endpoint")).then()
                    .statusCode(Integer.valueOf(value.get("statusCode")));
        }

    }

    @Given("I make a GET call to {string} its status code shoud be {int}")
    public void i_make_a_get_call_to_api_users_its_status_code_shoud_be(String endpoint, Integer statusCode) {

        apiUtils.buildRequestForGet(endpoint).then()
                .statusCode(Integer.valueOf(statusCode));

    }

}
