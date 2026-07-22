package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(xpath = "//img[@alt='logo']")
    private WebElement logo;

    @FindBy(xpath = "//input[@name='userId']")
    private WebElement userIdTxt;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordTxt;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement continueBtn;

    // Page Actions
    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    public void enterUserId(String userId) {
        userIdTxt.sendKeys("1063807");
    }

    public void enterPassword(String password) {
        passwordTxt.sendKeys("Welcome123");
    }

    public void clickContinue() {
        continueBtn.click();
    }
}
