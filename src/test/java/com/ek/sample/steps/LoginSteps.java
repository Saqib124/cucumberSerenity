package com.ek.sample.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseSteps {

    @Given("^User is on the marhaba website$")
    public void user_is_on_the_marhaba_website() throws Throwable {
        loginPage.open();
    }

    @When("^User provide the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_provide_the_and(String arg1, String arg2) throws Throwable {
        loginPage.selectAirport(arg1);
        loginPage.selectLocation(arg2);
    }

    @Then("^User navigated to home page$")
    public void user_navigated_to_home_page() throws Throwable {
        loginPage.tabLoginButton();
        System.out.println();
    }

}
