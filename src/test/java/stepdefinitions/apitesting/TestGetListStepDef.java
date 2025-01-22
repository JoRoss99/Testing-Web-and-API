package stepdefinitions.apitesting;

import Model.apitesting.UserProfile;
import helper.SetUpEndPoint;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testlogic.apitesting.APITestProcessGeneric;
import testlogic.apitesting.APIUserTest;

public class TestGetListStepDef {
    static APIUserTest apiUser;

    public TestGetListStepDef() {apiUser = new APIUserTest();}


    @Given("prepare url for {string}")
    public void prepareUrlFor(String endpoint) {
        // prepare end point API
        SetUpEndPoint.prepareURL(endpoint); // prepare end point
    }

    @When("hit api get list users")
    public void hitApiGetListUsers() {
        // call API for get all data user
        apiUser.hitAPIGetListUsers();
    }

    @Then("validation status code api user is equals {int}")
    public void validationStatusCodeApiUserIsEquals(int statusCode) {
        // check status response same with param statusCode
        APITestProcessGeneric.validationStatusCode(apiUser.getRes(), statusCode);
    }

    @Then("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        // check response body not null and field gender filled with female or male, also field status filled with active or inactive
        apiUser.checkResponseBodyListUsers();
    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String dataType) {
        // check response data using Json Schema format
        APITestProcessGeneric.validationResponseData(apiUser.getRes(), dataType);
    }
}
