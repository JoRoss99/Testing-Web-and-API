package stepdefinitions.apitesting;

import Model.apitesting.UserProfile;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testlogic.apitesting.APIUserTest;

public class DeleteUserStepDef {
    APIUserTest apiUser;
    UserProfile dataTestCreateUser, dataTestUpdateUser;
    String currentUserID;
    public DeleteUserStepDef() {apiUser =  TestGetListStepDef.apiUser;}


    @When("hit api delete user")
    public void hitApiDeleteUser() {
        apiUser.hitAPIDeleteUserById(currentUserID);
    }

    @Then("validation response body delete user")
    public void validationResponseBodyDeleteUser() {
        apiUser.checkResponseBodyDeleteUser(currentUserID);
    }

    @Then("hit api get profile user after deleted")
    public void hitApiGetProfileUserAfterDeleted() {
        apiUser.hitAPIGetProfileUser(currentUserID);
    }

    @Then("validation response body with message {string}")
    public void validationResponseBodyWithMessage(String message) {
        apiUser.checkResponseBodyGetProfileUserFailed(message);
    }
}
