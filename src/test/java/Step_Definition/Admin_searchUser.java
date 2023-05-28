package Step_Definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Admin_searchUser {

    public WebDriver driver;
    @Given("^I am logged in$")
    public void iAmLoggedIn() throws InterruptedException {
        System.setProperty("web-driver.chrome.driver", "c://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000); //wait for 2 seconds or 2000 milliseconds//
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);
    }

    @When("^I click the admin menu$")
    public void iClickTheAdminMenu() {
        driver.findElement(By.xpath("//span[text() = 'Admin']")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/button/i")).click();


        }

    @Then("^I should see the users page$")
    public void iShouldSeeTheUsersPage() {
        driver.findElement(By.xpath("//*h5[text() ='System Users']")).isDisplayed();
    }

    @When("^I enter user data$")
    public void iEnterUserData() {
        driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("Alic.Duval");
        //new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")))
    }

    @And("^click on the search button$")
    public void clickOnTheSearchButton() {
    }

    @Then("^Search results should return the correct user$")
    public void searchResultsShouldReturnTheCorrectUser() {
    }
}
