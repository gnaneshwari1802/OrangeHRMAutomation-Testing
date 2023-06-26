package Step_Definition;

import Base.TestBase;
import Pages.Admin_Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class CommonSteps1 extends TestBase {

    @Given("^I am on the application home page$")
    public void iAmOnTheApplicationHomePage() {
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
