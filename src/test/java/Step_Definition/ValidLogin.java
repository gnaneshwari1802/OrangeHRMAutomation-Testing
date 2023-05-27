package Step_Definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {
    public WebDriver driver;

    @Given("^I am on the landing page$")
    public void iAmOnTheLandingPage() throws InterruptedException {
        System.setProperty("web-driver.chrome.driver", "c://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000); //wait for 2 seconds or 2000 milliseconds//
    }

    @When("^I enter username in the username field$")
    public void iEnterUsernameInTheUsernameField() {
        driver.findElement(By.name("username")).sendKeys("Admin");
    }

    @And("^I enter password in the password field$")
    public void iEnterPasswordInThePasswordField() {
        driver.findElement(By.name("Password")).sendKeys("admin123");
    }

    @When("^I click the login button$")
    public void iClickTheLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);
    }

    @Then("^I should be successfully logged in$")
    public void iShouldBeSuccessfullyLoggedIn() {
        //String ExpectedLoggedInUser = "Paul Collings";
        //String ActualLoggedInUser = driver.findElement(By.xpath(""));
        //Assert.assertArrayEquals(ExpectedLoggedInUSer, ActualLoggedInUser);
        //System.out.println(ActualLoggedInUser);

        driver.quit();
    }
}
