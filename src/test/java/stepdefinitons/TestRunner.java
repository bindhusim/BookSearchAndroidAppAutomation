package stepdefinitons;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import pageobjects.BookSearchHome;

import java.net.InetAddress;

/**
 * Created by bindhu on 24/09/2016.
 */

    @RunWith(Cucumber.class)
    @CucumberOptions(dryRun = false, strict = true, features = "src/test/java/features/", tags = { "@Mobile" }, monochrome = true, format = {
            "pretty", "html:target/cucumber-htmlreport/booksearch",
            "json:target/cucumber-htmlreport/booksearch/cucumber-report.json",
            "junit:taget/cucumber.xml/booksearch/cucumber-junit-report.xml" })
    public class TestRunner extends BookSearchHome{

        public static BookSearchHome home;

        @BeforeClass
        public static void setUp(){
            try {
                System.out.println(" **********Calling set up in runner");
                System.out.println("Running on machine : "
                        + InetAddress.getLocalHost().getHostName());
                home.getBookSearchApp();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
