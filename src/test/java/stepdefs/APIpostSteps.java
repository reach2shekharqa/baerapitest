package stepdefs;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import context.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import util.APIUtils;

public class APIpostSteps {

    private final APIUtils apiUtils;
    private final TestContext testContext;

    public APIpostSteps(APIUtils apiUtils, TestContext testContext) {

        this.apiUtils = apiUtils;
        this.testContext = testContext;

    }

    @Given("I make a POST call to {string} with body")
    public void i_make_a_post_call_to_with_body(String endpoint, DataTable dataTable) throws IOException {
        //System.out.println("Thread: " + Thread.currentThread().getName() + " executing scenario: " + endpoint);

        List<Map<String, String>> filepathList = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> filepath : filepathList) {
            String filePath1 = filepath.get("filepath");
           // Response r = (Response) apiUtils.buildRequestForPost(endpoint, filePath1);
           // r.prettyPrint();

            testContext.set("response", apiUtils.buildRequestForPost(endpoint, filePath1));

        }
    }

}
