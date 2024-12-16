package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignupLoginPage {
    //setupDriverAndBrowser
    WebDriver driver;

    //Locators
    private By newUserSignupIsVisible = By.cssSelector("div.signup-form h2");
    private By nameField = By.name("name");
    private By emailField = By.xpath("//input[@data-qa='signup-email']");
    private By signupButton = By.xpath("//button[@data-qa='signup-button']");

    //Constructor
    public SignupLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Validate That User Located In The Signup Page To Register")
    ///////Validation\\\\\\\\\\\\
    public SignupLoginPage assertThatUserIsInSignupLoginPage()
    {
        Assert.assertTrue(driver.findElement(newUserSignupIsVisible).getText().contains("New User Signup!"),"Message That New User Signup Is Not Visible");
        System.out.println("!-----------New User Signup Is Visible---------!");
        return this;
    }

    @Step("User Enter The Username And Email To continue The Registration")
    /// //////Action\\\\\\\\\\\\\\\
    public SignupLoginPage userEnterNameAndEmail(String userName,String emailMail)
    {
        driver.findElement(nameField).sendKeys(userName);
        driver.findElement(emailField).sendKeys(emailMail);
        driver.findElement(signupButton).click();
        System.out.println("!-----------User Entered Valid Data Successfully---------!");
        return this;
    }
}
