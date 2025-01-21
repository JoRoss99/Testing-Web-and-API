package stepdefinitions.apitesting;

import Model.apitesting.UserProfile;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testlogic.apitesting.APIUserTest;

public class TestGetDataStepDef {
    APIUserTest apiUser;
    public TestGetDataStepDef() {apiUser =  TestGetListStepDef.apiUser;}

    @When("hit api get profile user by id {string}")
    public void hitApiGetProfileUserById(String idUser) {
        apiUser.hitAPIGetProfileUser(idUser);
    }

    @Then("validation response body get profile user")
    public void validationResponseBodyGetProfileUser() {
        apiUser.checkResponseBodyProfileUser();
    }
}
