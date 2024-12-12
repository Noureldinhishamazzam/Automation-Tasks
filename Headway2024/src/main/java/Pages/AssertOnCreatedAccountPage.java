package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AssertOnCreatedAccountPage {
    //setupDriverAndBrowser
    WebDriver driver;

    //Locators
    private By accountCreatedMessage = By.xpath("//h2[@data-qa='account-created']");
    private By continueButtonAfterCreateAccount = By.linkText("Continue");

    //Constructor
    public AssertOnCreatedAccountPage(WebDriver driver) {

        this.driver = driver;
    }

    @Step("Validate That User Created It's Account Successfully")
    /// /////////////////Validation\\\\\\\\\\\\\\\\\\\\
    public AssertOnCreatedAccountPage assertThatCreateMessageIsAppear()
    {
        Assert.assertEquals(driver.findElement(accountCreatedMessage).getText(), "ACCOUNT CREATED!", "Message Is Not Displayed");
        return this;
    }

    @Step("Validate That User Navigate To Home Page After Clicking On The Continue Button")
    /// ////////////////////////Action\\\\\\\\\\\\\\\\\\
    public AssertOnCreatedAccountPage clickOnContinueButtonAfterCreatedAccount()
    {
        driver.findElement(continueButtonAfterCreateAccount).click();
        System.out.println("!-----------Registration Is Successfully Done---------!");
        return this;
    }

}
