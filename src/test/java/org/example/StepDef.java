package org.example;

import io.cucumber.java.en.*;

public class StepDef {

    SignUpPage signUpPage = new SignUpPage();
    HomePage homePage = new HomePage();


    @Given("user is on homepage")
    public void user_is_on_homepage() {
        homePage.userISOnHomePage();


    }

    @When("when user fills up sign ups form")
    public void when_user_fills_up_sign_ups_form() {
        signUpPage.userEntersFirstNameAndLastName();
        signUpPage.userFillsUpPersonalDetails();
        signUpPage.userIsAbleToUploadFile();
     //   signUpPage.userIsAbleToDownloadFile();



    }

    @When("user clicks on sign up button")
    public void user_clicks_on_sign_up_button() {

    }

    @Then("user should be registered successfully")
    public void user_should_be_registered_successfully() {

    }
}
