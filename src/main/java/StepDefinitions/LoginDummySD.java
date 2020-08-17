package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginDummySD {
    @Given("^we are on the login page$")
    public void we_are_on_the_login_page() throws Throwable {
        System.out.println("we are on the login page");
    }

   @When("^we enter correct username & password$")
    public void we_enter_correct_username_password() throws Throwable {
        System.out.println("we enter correct username & password");

    }

    @When("^we enter incorrect username & password$")
    public void we_enter_incorrect_username_password() throws Throwable {
        System.out.println("we enter incorrect username & password");

    }

    @When("^we enter blank username & password$")
    public void we_enter_blank_username_password() throws Throwable {
        System.out.println("we do not enter username & password");

    }

    @When("we enter {string} & {string}")
    public void we_enter(String username, String password) {

        System.out.println("We enterd Username:"+username+" Password:"+password);
    }


    @Then("^we should land up to the home page$")
    public void we_should_land_up_to_the_home_page() throws Throwable {
        System.out.println("we should land up to the home page");
    }

    @Then("^There should be error message$")
    public void there_should_be_error_message() throws Throwable {
        //System.out.println("we should land up to the home page");

        Assert.assertTrue("incorrect erroe message",false);


    }

    @Then("^we should be on same page$")
    public void we_should_be_on_same_page() throws Throwable {
        System.out.println("There should be error message");

    }

    @And("^click on login button$")
    public void click_on_login_button() throws Throwable {

        System.out.println("click on login button");
    }


    @When("^we will enter (.+) & (.+)$")
    public void we_will_enter_(String username, String password)  {

        System.out.println("We enterd Username:"+username+" Password:"+password);


    }


    @Given("^I open browser$")
    public void i_open_browser() throws Throwable {
        System.out.println("---------I open browser----------");
    }

    @And("^I Maximize it$")
    public void i_maximize_it() throws Throwable {
        System.out.println("---------I Maximize browser----------");
    }

}
