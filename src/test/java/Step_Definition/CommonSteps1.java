package Step_Definition;

import Base.TestBase;
import Pages.Admin_Pages;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class CommonSteps1 extends TestBase {

    //A method call the TestBase.java file
    @Before
    public void setup() throws IOException{
        initialise();
    }
    @Given("^I am on the application home page$")
    public void iAmOnTheApplicationHomePage() throws InterruptedException {
        driver.manage().deleteAllCookies();   // code that deletes all cookies when a new instance of the driver ís initiated
        driver.get(CONFIG.getProperty("URL")); // get url from config.properties file
        driver.manage().window().maximize();
    }

    @And("^I login$")
    public void iLogin() throws InterruptedException {
        Admin_Pages page = PageFactory.initElements(driver, Admin_Pages.class);
        page.enterLoginUsername();
        page.enterLoginPassword();
        page.clickLoginButton();
        Thread.sleep(3000);

    }
}
