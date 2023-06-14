package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Admin_Pages {
    @FindBy(how = How.NAME, using = "username")
    public static WebElement UserNameLoginField; // declared as a static element

    @FindBy(how = How.NAME, using = "password")
    public static WebElement PasswordLoginField;

    @FindBy(how = How.NAME, using = "username")
    public static WebElement UserNameLoginField;

    @FindBy(how = How.NAME, using = "username")
    public static WebElement UserNameLoginField;

    @FindBy(how = How.NAME, using = "username")
    public static WebElement UserNameLoginField;


}
