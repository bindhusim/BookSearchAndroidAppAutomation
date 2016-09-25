package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by bindhu on 24/09/2016.
 */
public class BookParticularsPage extends Page {

    String bookTitle = "com.codepath.android.booksearch:id/tvTitle";
    String bookAuthor = "com.codepath.android.booksearch:id/tvAuthor";
    String bookPublisher = "com.codepath.android.booksearch:id/tvPublisher";
    String shareButton = "com.codepath.android.booksearch:id/action_share";
    String shareImage = "android:id/title";
    String shareList = "//android.widget.TextView[@resource-id='android:id/text1']";

    public WebElement getBookTitleFeild(){
        return getElement(By.id(bookTitle));
    }

    public WebElement getBookAuthorFeild(){
        return getElement(By.id(bookAuthor));
    }

    public WebElement getBookPublisherFeild(){
        return getElement(By.id(bookPublisher));
    }

    public WebElement getShareButton(){
        return getElement(By.id(shareButton));
    }
    public WebElement getShareImage(){
        return getElement(By.id(shareImage));
    }

    public boolean getListOfElements() {
        List<WebElement> elements = new ArrayList<WebElement>();
        boolean flag = true;
        elements = getListOfElements(By.xpath(shareList));
        for (WebElement element : elements) {
            String text = element.getText();
            if(text.equalsIgnoreCase("WhatsApp")){
                return flag = true;
            }
            else {
                return flag = true;
            }
        } return flag;
    }
}
