package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

// This page collects information from the Admin_searchUser.java file
public class Admin_Pages {

    //Declare your locators
    @FindBy(how = How.NAME, using = "username") // Ask junit to find an element by Name
    public static WebElement UserNameLoginField; // USerNameLoginField is declared as a static element

    @FindBy(how = How.NAME, using = "password")
    public static WebElement PasswordLoginField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public static WebElement LoginButton;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Admin']")
    public static WebElement AdminMenuButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/div/div/button")
    public static WebElement MenuToggleButton;

    @FindBy(how = How.XPATH, using = "//h5[text() ='System Users']")
    public static WebElement SystemUserText;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    public static WebElement UserNameSearchField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    public static WebElement SearchButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div")
    public static WebElement UserNameColumn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[3]/div")
    public static WebElement UserRoleColumn;


    //Declare your methods
    public void enterLoginUsername() {
        UserNameLoginField.sendKeys("Admin");
    }

    public void enterLoginPassword() {
        PasswordLoginField.sendKeys("admin123");
    }

    public void clickLoginButton() {
        LoginButton.click();
    }

    public void clickAdminMenu() {
        AdminMenuButton.click();
    }

    public void closeMenu() {
        MenuToggleButton.click();
    }

    public void AssertSystemUsersPage() {
        SystemUserText.isDisplayed();
    }

    public void searchByUsername() {
        UserNameSearchField.sendKeys("Admin");
    }

    public void clickSearchButton() {
        SearchButton.click();
    }

    public void AssertSearchResult() {
        String ExpectedReturnedUsername = "Admin";        // UserNameColumn
        String ActualReturnedUsername = UserNameColumn.getText();
        Assert.assertEquals(ExpectedReturnedUsername, ActualReturnedUsername);
        System.out.println(ActualReturnedUsername);

        String ExpectedReturnedUserRole = "Admin";     // UserRoleColumn
        String ActualReturnedUserRole = UserRoleColumn.getText();
        Assert.assertEquals(ExpectedReturnedUserRole, ActualReturnedUserRole);
        System.out.println(ActualReturnedUserRole);
    }


}
