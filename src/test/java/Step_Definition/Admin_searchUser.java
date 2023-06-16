package Step_Definition;

import Pages.Admin_Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Admin_searchUser {

    public WebDriver driver;

    /**
     * //Commented out because we have created a Background/Pre-condition in the Admin_searchUser.feature file
    @Given("^I am logged in$") **/
    /**
     * //Commented out because we have created a Background/Pre-condition in the Admin_searchUser.feature file
    public void iAmLoggedIn() throws InterruptedException {

        System.setProperty("web-driver.chrome.driver", "c://chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000); //wait for 2 seconds or 2000 milliseconds//

        Admin_Pages page = PageFactory.initElements(driver, Admin_Pages.class);
        page.enterLoginUsername();
        page.enterLoginPassword();
        page.clickLoginButton();

        **/

        /** //Commented out because it has been now declared in the Page Object Model file : Admin.Pages.java //
         driver.findElement(By.name("username")).sendKeys("Admin");
         driver.findElement(By.name("password")).sendKeys("admin123");
         driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click(); // LoginButton


        Thread.sleep(3000);

    }
         **/

    @When("^I click the admin menu$")
    public void iClickTheAdminMenu() throws InterruptedException {
        Admin_Pages page = PageFactory.initElements(driver, Admin_Pages.class);
        page.clickAdminMenu();
        //Commented out because it has been now declared in the Page Object Model file : Admin.Pages.java //
        //driver.findElement(By.xpath("//span[text() = 'Admin']")).click(); //AdminMenuButton
        Thread.sleep(3000);

        page.closeMenu();
        //Commented out because it has been now declared in the Page Object Model file : Admin.Pages.java //
        //driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/div/div/button")).click(); // MenuToggleButton MinimizeMenuBar

    }

    @Then("^I should see the users page$")
    public void iShouldSeeTheUsersPage() throws InterruptedException {
        Admin_Pages page = PageFactory.initElements(driver, Admin_Pages.class);
        page.AssertSystemUsersPage();
        Thread.sleep(2000);
        //Commented out because it has been now declared in the Page Object Model file : Admin.Pages.java //
        //driver.findElement(By.xpath("//h5[text() ='System Users']")).isDisplayed();   // SystemUserText
        /**driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[1]/h5")).isDisplayed(); **/
    }

    @When("^I enter user data$")
    public void iEnterUserData() throws InterruptedException {
        Admin_Pages page = PageFactory.initElements(driver, Admin_Pages.class);
        page.searchByUsername();
        Thread.sleep(2000);
        //Commented out because it has been now declared in the Page Object Model file : Admin.Pages.java //
        //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Admin"); // UserNameSearchField text field for Username

        /**
        Thread.sleep(2000);
        new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"))).selectByVisibleText("ESS");  // because this is a drop-down field for User Role
        // ERROR-:- org.openqa.selenium.support.ui.UnexpectedTagNameException: Element should have been "select" but was "div"
        // Select function cannot work because of bad web design. There is no "select" inside the DOM. Only a "div" is present. We cannot use the Select property. To resolve this, click on the drop-down menu and then click on the field you want to select.
        //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")).sendKeys("Admin"); // text field for Employee Name
        Thread.sleep(2000);
        new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]"))).selectByVisibleText("Enabled");  // because this is a drop-down field for Status
        **/

    }

    @And("^click on the search button$")
    public void clickOnTheSearchButton() throws InterruptedException {
        Admin_Pages page = PageFactory.initElements(driver, Admin_Pages.class);
        page.clickSearchButton();
        //Commented out because it has been now declared in the Page Object Model file : Admin.Pages.java //
        //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click(); // SearchButton
        Thread.sleep(5000);
    }

    @Then("^Search results should return the correct user$")
    public void searchResultsShouldReturnTheCorrectUser() {
        Admin_Pages page = PageFactory.initElements(driver, Admin_Pages.class);
        page.AssertSearchResult();
        /** //Commented out because it has been now declared in the Page Object Model file : Admin.Pages.java //
        String ExpectedReturnedUsername = "Admin";        // UserNameColumn
        String ActualReturnedUsername = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")).getText();
        Assert.assertEquals(ExpectedReturnedUsername, ActualReturnedUsername);
        System.out.println(ActualReturnedUsername);

        String ExpectedReturnedUserRole = "Admin";     // UserRoleColumn
        String ActualReturnedUserRole = driver.findElement(By.xpath("//*[@id="app"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div")).getText();
        Assert.assertEquals(ExpectedReturnedUserRole, ActualReturnedUserRole);
        System.out.println(ActualReturnedUserRole);

        **/


        /** //User : Alic Duval is inconsistent in the OrangeHRM platform
        String ExpectedReturnedEmployeeName = "Alice Duval";
        String ActualReturnedEmployeeName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[5]/div")).getText();
        Assert.assertEquals(ExpectedReturnedEmployeeName, ActualReturnedEmployeeName);
        System.out.println(ActualReturnedEmployeeName);

        String ExpectedReturnedStatus = "Enabled";
        String ActualReturnedStatus = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[5]/div")).getText();
        Assert.assertEquals(ExpectedReturnedStatus, ActualReturnedStatus);
        System.out.println(ActualReturnedStatus);
        **/
        driver.quit();
    }
}
