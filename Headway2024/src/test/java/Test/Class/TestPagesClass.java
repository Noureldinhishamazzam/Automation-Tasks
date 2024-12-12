package Test.Class;

import Pages.*;
import Utilties.DriverFactory;
import Utilties.JsonFileManager;
import Utilties.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPagesClass
{
    WebDriver driver;
    JsonFileManager jm;
    String urlOfWebsite = "https://automationexercise.com/";

    @Severity(SeverityLevel.CRITICAL)
    @Test
    @Description("Register New User to Able To Login Into The System")
    public void registrationTestCases(){
        new HomePage(driver).navigateToWebsite()
        .asserThatUserISInHomePage();
        new MenuBar(driver).userClickOnSignupLoginLink();
        new SignupLoginPage(driver).assertThatUserIsInSignupLoginPage()
        .userEnterNameAndEmail(jm.getTestData("UserName"),jm.getTestData("UserMail"));
        new RegistrationPage(driver).assertThatUserISInEnterAccountInformationPage()
        .enterAccountInformation("Nourazzam","21",9,"1998")
        .addressInformation("Nour","Azzam","Gizasystem","Cairo","Nasrcity","Canada","Manitoba","Montreal","000000","01009266955");
        new AssertOnCreatedAccountPage(driver).assertThatCreateMessageIsAppear()
        .clickOnContinueButtonAfterCreatedAccount();
        new MenuBar(driver).userNameIsDisplayInHomePage()
        .clickOnDeleteAccountLink();
        new AssertOnDeletedAccountPage(driver).asserThatDeleteMessageIsDisplayed();
    }

    @BeforeClass
    public void setupBrowser()
    {
        driver =DriverFactory.initiateDriver(System.getProperty("browserName"),true);
        jm=new JsonFileManager("src/test/resources/TestData.json");
    }

    @AfterClass
    public void quitDriver()
    {
        driver.quit();
    }

    @BeforeSuite
    public void beforeSuite()
    {
        PropertiesReader.loadProperties();
    }
}
