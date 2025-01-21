package stepdefinitions.apitesting;

import Model.apitesting.UserProfile;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testlogic.apitesting.APITestProcessGeneric;
import testlogic.apitesting.APIUserTest;

import java.text.ParseException;

public class CreateNewUser {
    APIUserTest apiUser;
    UserProfile dataTestCreateUser, dataTestUpdateUser;
    String currentUserID;
    public CreateNewUser() {apiUser =  TestGetListStepDef.apiUser;}

    @When("hit api post create new user")
    public void hitApiPostCreateNewUser() {
        dataTestCreateUser = APITestProcessGeneric.prepareDataUserTestPost();
        apiUser.hitAPIPostNewUser(dataTestCreateUser);
    }

    @Then("validation response body post create new user")
    public void validationResponseBodyPostCreateNewUser() throws ParseException {
        apiUser.checkResponseBodyCreateUser(dataTestCreateUser);
    }
}
