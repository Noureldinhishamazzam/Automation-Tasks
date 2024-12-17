package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage {
    //setupDriverAndBrowser
    WebDriver driver;

    //Locators
    private By enterAccountInformationIsVisble = By.xpath("(//b)[1]");
    private By clickOnGender = By.id("id_gender1");
    private By enterPassword = By.id("password");
    private By selectDay = By.id("days");
    private By selectMonth = By.id("months");
    private By selectYear = By.id("years");
    private By firstCheckButton = By.id("newsletter");
    private By secondCheckButton = By.id("optin");
    private By enterFirstName = By.id("first_name");
    private By enterSecondName = By.id("last_name");
    private By enterCompanyName = By.id("company");
    private By enterFirstAddress = By.id("address1");
    private By enterSecondAddress = By.id("address2");
    private By selectCountry = By.id("country");
    private By enterStateName = By.id("state");
    private By enterCityName = By.id("city");
    private By enterZipCode = By.id("zipcode");
    private By enterMobileNumber = By.id("mobile_number");
    private By clickOnCreateAccountButton = By.xpath("//button[@data-qa='create-account']");

    //Constructor
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;}

    @Step("Validate That User Is Located In The Registration Page ")
    /// //////Validation\\\\\\\\\\\\\\\\\\
    public RegistrationPage assertThatUserISInEnterAccountInformationPage()
    {
        Assert.assertEquals(driver.findElement(enterAccountInformationIsVisble).getText(),"ENTER ACCOUNT INFORMATION", "The Message Is Not Displayed");
        System.out.println("!-----------User IS In The Enter Account Information Page---------!");
        return this;
    }

    @Step("User Enter It's Account Information ")
    /// /////////////Action\\\\\\\\\\\\\\\\\\
    public RegistrationPage enterAccountInformation(String Password,String day,int month,String year)
    {
        // Choose Gender type and Enter password
        driver.findElement(clickOnGender).click();
        driver.findElement(enterPassword).sendKeys(Password);
        // Enter birthdate
        new Select(driver.findElement(selectDay)).selectByValue(day);
        new Select(driver.findElement(selectMonth)).selectByIndex(month);
        new Select(driver.findElement(selectYear)).selectByValue(year);
        // Click on checklists below birthdate
        driver.findElement(firstCheckButton).click();
        driver.findElement(secondCheckButton).click();
        return this;
    }

    @Step("User Enter It's Address Information")
    public RegistrationPage addressInformation(String firstName, String secondName, String companyName, String address1, String address2, String country, String stateName, String cityName, String zipCode, String mobile)
    {
        // Enter first and last name and company name and addresses
        driver.findElement(enterFirstName).sendKeys(firstName);
        driver.findElement(enterSecondName).sendKeys(secondName);
        driver.findElement(enterCompanyName).sendKeys(companyName);
        driver.findElement(enterFirstAddress).sendKeys(address1);
        driver.findElement(enterSecondAddress).sendKeys(address2);
        // Select country and its information
        new Select(driver.findElement(selectCountry)).selectByValue(country);
        driver.findElement(enterStateName).sendKeys(stateName);
        driver.findElement(enterCityName).sendKeys(cityName);
        driver.findElement(enterZipCode).sendKeys(zipCode);
        // Enter mobile number
        driver.findElement(enterMobileNumber).sendKeys(mobile);
        driver.findElement(clickOnCreateAccountButton).click();

        System.out.println("!-----------The Registration Is Filled Successfully---------!");
        return this;
    }
}
