package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 * Created by bindhu on 24/09/2016.
 */
public class SearchResultsPage extends Page {

    String listView = "com.codepath.android.booksearch:id/lvBooks";
    String bookList = "//android.widget.TextView[@resource-id='com.codepath.android.booksearch:id/tvAuthor']";
    String searchField = "com.codepath.android.booksearch:id/search_src_text";


    public WebElement getSearchField(){
        return getElement(By.id(searchField));
    }
    public WebElement getListView(){
        return getElement(By.id(listView));
    }

    public WebElement getSearchresults(){
       return  waitForElement(getListView(), 10);
    }

    public int getCountOfResults(){
        return getListOfElements(By.xpath(bookList)).size();
    }

    public String getFirstElementText(){
        return getFirstItemInList().getText();
    }

    public WebElement getFirstItemInList(){
        return getElement(By.xpath(bookList));
    }
}
