package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MenuBar {
    WebDriver driver;
    private String userName = "Nourazzam";

    public MenuBar(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By signupLoginButtonLink = By.linkText("Signup / Login");
    private By userNameIsVisibleInHomePage = By.xpath("//a[b]");
    private By deleteButton = By.xpath("//a[@href='/delete_account']");
    /// ///Action\\\\\\\\\\\\
    public MenuBar userClickOnSignupLoginLink()
    {
        driver.findElement(signupLoginButtonLink).click();
        System.out.println("!-----------User Click On Link And Redirected Successfully to Signup Page---------!");
        return this;
    }

    @Step("Validate That The Username Of Register User Is Visible In Menu Bar")
    /// ///////Validation\\\\\\\\\\
    public MenuBar userNameIsDisplayInHomePage()
    {
        Assert.assertEquals(driver.findElement(userNameIsVisibleInHomePage).getText(), "Logged in as "+ userName ,"Username Is Not Visible");
        return this;
    }

    /////////////Action\\\\\\\\\\\\\\\\\\\\\\\\
    @Step("User Able To Delete It's Acoount By Clicking On Delete Account Link In Menu Bar")
    public MenuBar clickOnDeleteAccountLink()
    {
        driver.findElement(deleteButton).click();
        return this;
    }
}
