package pageobjects;

import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 * Created by bindhu on 24/09/2016.
 */
public class HomePage extends SearchResultsPage {


    String bookSearchField = "//android.widget.TextView[@text='BookSearch']";

    String searchButton = "com.codepath.android.booksearch:id/search_button";


    public WebElement getBookSearchField(){
       return  getElement(By.xpath(bookSearchField));
    }

    public WebElement getSearchButton(){
        return  getElement(By.id(searchButton));
    }
    public boolean  isBookSearchFieldDisplayed(){
        return  elementDisplayed(By.xpath(bookSearchField));
     }

    public void submitSearch(String searchString){
        getElement(By.id(searchButton)).click();
        if(elementDisplayed(By.xpath(bookSearchField))) {
            getBookSearchField().sendKeys(searchString);
        }else {
            getSearchField().sendKeys(searchString);
        }
        driver.pressKeyCode(AndroidKeyCode.ENTER);
    }
}
