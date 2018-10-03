package api;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApiStepDefs {

    @Given("^I am on the login page$")
    public void navigateToLoginPage() throws Exception {
        System.out.println("API CODE!");
        throw new PendingException();
    }

    @When("^I submit valid credentials$")
    public void submitCredentials() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I am logged in successfully$")
    public void checkLogin() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
