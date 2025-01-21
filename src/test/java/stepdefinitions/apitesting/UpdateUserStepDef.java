package stepdefinitions.apitesting;

import Model.apitesting.UserProfile;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testlogic.apitesting.APITestProcessGeneric;
import testlogic.apitesting.APIUserTest;
import testlogic.apitesting.request.EndPoint;

import java.text.ParseException;

public class UpdateUserStepDef {
    APIUserTest apiUser;
    UserProfile dataTestCreateUser, dataTestUpdateUser;
    String currentUserID;
    public UpdateUserStepDef() {apiUser =  TestGetListStepDef.apiUser;}

    @And("hit api post create new user for manipulation data")
    public void hitApiPostCreateNewUserForManipulationData() {
        dataTestCreateUser = APITestProcessGeneric.prepareDataUserTestPost();
        currentUserID = apiUser.hitAPIPostNewUser(EndPoint.CREATE_NEW_USER, dataTestCreateUser);
        System.out.println("current id after created : " + currentUserID);
    }

    @When("hit api update profile user")
    public void hitApiUpdateProfileUser() {
        dataTestUpdateUser = APITestProcessGeneric.prepareDataUserTestUpdate();
        apiUser.hitAPIUpdateProfileUser(dataTestUpdateUser, currentUserID);
    }

    @Then("validation response body update user")
    public void validationResponseBodyUpdateUser() throws ParseException {
        apiUser.checkResponseBodyUpdateProfileUser(dataTestUpdateUser, currentUserID);
    }
}
