package pageobjects;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Created by bindhu on 24/09/2016.
 */
public abstract class Page extends Driver {
    public WebDriverWait wait;

    protected Logger log = Logger.getLogger(this.getClass().getSimpleName());


    public WebElement getElement(By by){
        return driver.findElement(by);
    }

    public void navigateBack(){
         driver.navigate().back();
    }

    public WebElement waitForElement(WebElement element, int timeInSeconds){
        WebElement element1 = null;
        wait = new WebDriverWait(driver, timeInSeconds);
        try {
            element1 = wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            log.info("Couldn't find expected element " + element + " " + e.getMessage());
        }
        return element1;
    }

    public List<WebElement> getListOfElements(By by){
        driver.getPageSource();
        return driver.findElements(by);
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public boolean elementDisplayed(By by) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        boolean displayed;
        try {
            displayed = driver.findElement(by).isDisplayed();
        } catch (Exception e) {
            displayed = false;
        }
        return displayed;
    }

    public void swipeDown() {
        Dimension size = driver.manage().window().getSize();
        int startx = (size.width / 2);
        int endy = (int) (size.width * 0.10);
        int starty = (int) (size.height * 0.9);
        driver.swipe(startx, starty, startx, endy, 1000);
    }

}

