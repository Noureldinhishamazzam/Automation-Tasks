package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AssertOnDeletedAccountPage
{
    //setupDriverAndBrowser
    WebDriver driver;

    //Locators
    private By deleteMessageIsVisible = By.xpath("//h2[@data-qa='account-deleted']");

    //Constructor
    public AssertOnDeletedAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Validate That User Deleted It's Account Successfully")
    /// /////////Validation\\\\\\\\\\\\\
    public AssertOnDeletedAccountPage asserThatDeleteMessageIsDisplayed()
    {
        Assert.assertEquals(driver.findElement(deleteMessageIsVisible).getText(), "ACCOUNT DELETED!", "Message Is Not Displayed");
        System.out.println("!-----------Account Deleted Successfully---------!");
        return this;
    }
}
