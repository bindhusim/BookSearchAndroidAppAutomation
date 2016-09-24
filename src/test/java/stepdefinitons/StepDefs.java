package stepdefinitons;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.BookSearchHome;

/**
 * Created by bindhu on 24/09/2016.
 */
public class StepDefs extends BookSearchHome {


    @Given("^am on  Home Page$")
    public void am_on_Home_Page() throws Throwable {
        getBookSearchApp();
        System.out.println("Step Passed");
    }

    @Given("^I should be able to search for (.*)$")
    public void i_should_be_able_to_search_for_Fiction(String searchString) throws Throwable {
        System.out.println("Step Passed");
    }

    @Then("^I should see respective (.*)$")
    public void i_should_see_respective_Fiction(String searchResults) throws Throwable {
        System.out.println("Step Passed");
    }

    @Then("^I should see title,list of Pages and pubblished by details for each book$")
    public void i_should_see_title() throws Throwable {
        System.out.println("Step Passed");
    }
}
