package stepdefinitions.apitesting;

import Model.apitesting.UserProfile;
import helper.SetUpEndPoint;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testlogic.apitesting.APIUserTest;
import testlogic.apitesting.APITestProcessGeneric;
import testlogic.apitesting.request.EndPoint;

import java.text.ParseException;

public class ApiUserStep {
    APIUserTest apiUser;
    UserProfile dataTestCreateUser, dataTestUpdateUser;
    String currentUserID;

    public ApiUserStep(){
        apiUser = new APIUserTest();
    }



    /***************************** Step Operation For Validation API Get List Users ***************************** */


    /***************************** Step Operation For Validation API Get Profile User ***************************** */


    /***************************** Step Operation For Validation API Post Create User ***************************** */



    /***************************** Step Operation For Validation API Put Update User ***************************** */


    /***************************** Step Operation For Validation API Delete User ***************************** */


}
