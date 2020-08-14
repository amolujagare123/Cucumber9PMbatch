package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class UserdetailsSD {

    @Given("user details page should be opened")
    public void user_details_page_should_be_opened() {
        System.out.println("user details page is opned");
    }

    @When("I enter user details as below")
    public void i_enter_user_details_as_below(DataTable dataTable) {

/*            List<List<String>> data =   dataTable.asLists();

        System.out.println("Name:"+data.get(0).get(0));
        System.out.println("Contact no:"+data.get(0).get(1));
        System.out.println("Email:"+data.get(0).get(2));
        System.out.println("City:"+data.get(0).get(3));*/

        System.out.println("Using another");
       List<String> data1 =  dataTable.asList();
       // System.out.println(data1);

        System.out.println("Name:"+data1.get(0));
        System.out.println("Contact no:"+data1.get(1));
        System.out.println("Email:"+data1.get(2));
        System.out.println("City:"+data1.get(3));




    }

    @When("click on submit button")
    public void click_on_submit_button() {
        System.out.println("submit button is clicked");
    }

    @Then("record should be added successfully")
    public void record_should_be_added_successfully() {
        System.out.println("record should be added successfully");
    }




}
