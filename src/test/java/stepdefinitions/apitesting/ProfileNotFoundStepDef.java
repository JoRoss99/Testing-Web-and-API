package stepdefinitions.apitesting;

import io.cucumber.java.en.Then;
import testlogic.apitesting.APIUserTest;

public class DataProfileNotFound {
    APIUserTest apiUser;
    public DataProfileNotFound() {apiUser =  TestGetListStepDef.apiUser;}

    @Then("validation response body with message {string}")
    public void validationResponseBodyWithMessage(String message) {
        apiUser.checkResponseBodyGetProfileUserFailed(message);
    }
}
