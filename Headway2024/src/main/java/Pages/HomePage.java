package Pages;

import Utilties.DriverFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    //setupDriverAndBrowser
    WebDriver driver;
    String urlOfWebsite = "https://automationexercise.com/";

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    //Locators
    private By homePageIsVisible = By.xpath("//img[@src='/static/images/home/logo.png']");

    @Step("Validate That The User Located In The Home Page Of The System")
    /// ////////////Validation\\\\\\\\\\\\\\\\\\\\\\\
    public HomePage asserThatUserISInHomePage()
    {
        Assert.assertTrue(driver.findElement(homePageIsVisible).isDisplayed(),"User Is Not In Home Page");
        Assert.assertEquals(driver.getCurrentUrl(),urlOfWebsite);
        System.out.println("!-----------User IS In The Home Page---------!");
    return this;
    }

    @Step("Navigate to Home Page of WebSite")
    /// /////////////Action\\\\\\\\\\\\\\\\\\\\\\\\
    public HomePage navigateToWebsite(){
        driver.navigate().to(urlOfWebsite);
        return this;
    }
}



