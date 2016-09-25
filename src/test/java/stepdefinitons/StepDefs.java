package stepdefinitons;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pageobjects.BookParticularsPage;
import pageobjects.HomePage;
import pageobjects.Page;
import pageobjects.SearchResultsPage;


/**
 * Created by bindhu on 24/09/2016.
 */
public class StepDefs extends Page {


    HomePage homePage = new HomePage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    BookParticularsPage bookParticularsPage = new BookParticularsPage();

    @Given("^am on  Home Page$")
    public void am_on_Home_Page() throws Throwable {
        if(homePage.isBookSearchFieldDisplayed()) {
            Assert.assertTrue(homePage.getBookSearchField().isDisplayed());
        }else {
            Assert.assertTrue(homePage.getSearchButton().isDisplayed());
        }
    }

    @Given("^I should be able to search for (.*)$")
    public void i_should_be_able_to_search_for_Fiction(String searchString) throws Throwable {
        homePage.submitSearch(searchString);
        Assert.assertTrue(searchResultsPage.getSearchresults().isDisplayed());
    }

    @Then("^I should see respective search results for (.*)$")
    public void i_should_see_respective_Fiction(String searchResults) throws Throwable {
        int count = searchResultsPage.getCountOfResults();
        if(searchResultsPage.getCountOfResults() != 0){
            Assert.assertTrue(searchResultsPage.getFirstElementText().contains(searchResults));
        }
    }

    @Then("^I should see title,author and publisher$")
    public void i_should_see_title_author_publisher() throws Throwable {
        searchResultsPage.getFirstItemInList().click();

        Assert.assertTrue(bookParticularsPage.getBookTitleFeild().isDisplayed());
        Assert.assertTrue(bookParticularsPage.getBookAuthorFeild().isDisplayed());
        Assert.assertTrue(bookParticularsPage.getBookPublisherFeild().isDisplayed());
        navigateBack();
    }

    @And("^I navigate to book particulars page$")
    public void i_navigate_to_book_particulars_page() throws Throwable {
        searchResultsPage.getFirstItemInList().click();

    }

    @Then("^I verify book can be shared$")
    public void i_share_the_book() throws Throwable {
        bookParticularsPage.getShareButton().click();
        swipeDown();
        Assert.assertTrue(bookParticularsPage.getListOfElements());
        }
}
