package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import test.apiTest;

public class apiStep {
    apiTest tesAPI;
    public apiStep(){
        this.tesAPI = new apiTest();
    }

    @Given("prepare URL {string}")
    public void prepareURL(String url) {
        tesAPI.prepareURL(url);
    }
    @And("hit API request GET")
    public void hitAPIrequestGET() {
        tesAPI.hitAPIrequestGET();
    }
    @Then("verification status code {int}")
    public void verificationStatusCode(int status_code) {
        tesAPI.verificationStatusCode(status_code);
    }
    @Then("verification response body GET data Reqres")
    public void verificationResponseBodyGETDataReqres() {
        tesAPI.verificationResponseBodyGETDataReqres();
    }
    @Then("verification response json with JSON Schema {string}")
    public void verificationResponseJsonWithJSONSchema(String filename) {
        tesAPI.verificationResponseJsonWithJSONSchema(filename);
    }
    @And("hit API request POST")
    public void hitAPIRequestPOST() {
        tesAPI.hitAPIRequestPOST();
    }
    @Then("verification response body POST create data")
    public void verificationResponseBodyPOSTCreateData() {
        tesAPI.verificationResponseBodyPOSTCreateData();
    }
    @And("hit API request PATCH")
    public void hitAPIRequestPATCH() {
        tesAPI.hitAPIRequestPATCH();
    }
    @Then("verification response body PATCH update data")
    public void verificationResponseBodyPATCHUpdateData() {
        tesAPI.verificationResponseBodyPATCHUpdateData();
    }
    @And("hit API request DELETE")
    public void hitAPIRequestDELETE() {
        tesAPI.hitAPIRequestDELETE();
    }

    @And("hit API request GET unregistered_user")
    public void hitAPIRequestGETUnregistered_user() {
        tesAPI.hitAPIRequestGETUnregistered_user();
    }

    @And("hit API request POST data abnormal")
    public void hitAPIRequestPOSTDataabnormal() {
        tesAPI.hitAPIRequestPOSTWithDataAbnormal();
    }

    @Then("verification response body GET data gorest")
    public void verificationResponseBodyGETDatagorest() {
        tesAPI.verificationResponseBodyGETDatagorest();
    }

    @Then("hit API request PATCH unauthorized")
    public void hitAPIRequestPATCHUnauthorized() {
        tesAPI.hitAPIRequestPATCHUnauthorized();
    }

    @And("hit API request DELETE without Authorization")
    public void hitAPIRequestDELETEWithoutAuthorization() {
        tesAPI.hitAPIRequestDELETEWithoutAuthorization();
    }
}