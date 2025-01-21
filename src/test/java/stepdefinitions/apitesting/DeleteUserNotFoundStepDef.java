package stepdefinitions.apitesting;

import Model.apitesting.UserProfile;
import io.cucumber.java.en.When;
import testlogic.apitesting.APIUserTest;

public class DeleteUserNotFoundStepDef {
    APIUserTest apiUser;
    public DeleteUserNotFoundStepDef() {apiUser =  TestGetListStepDef.apiUser;}

    @When("hit api delete user for id {string}")
    public void hitApiDeleteUserForId(String idUser) {
        apiUser.hitAPIDeleteUserById(idUser);
    }
}
