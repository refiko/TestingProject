package ui_test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOpenMrsPage {

public LoginOpenMrsPage(WebDriver driver){
    PageFactory.initElements(driver, this);
}

@FindBy(id = "username")
    public WebElement username;

@FindBy(id = "password")
    public WebElement password;

@FindBy(id = "Pharmacy")
    public WebElement location;

@FindBy(id = "error-message")
    public WebElement error;

@FindBy(id = "loginButton")
    public WebElement loginButton;

@FindBy(xpath = "//a[contains(text(), 'Logout')]")
    public WebElement logoutButton;
}
