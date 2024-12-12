package FirstScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//public class testNGDemo {
//    WebDriver driver;
//
//    @BeforeClass
//    public void setUpTheBrowserToOpen()
//    {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.navigate().to("https://automationexercise.com/");
//    }
//
//    @Test
//    public void validateThatUserISInTheHomePage()
//    {
//        Assert.assertTrue(driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']")).isDisplayed(), "Is Not Displayed");
//        System.out.println("-----------User IS In The Home Page---------!");
//    }
//
//    @Test(dependsOnMethods = {"validateThatUserISInTheHomePage"})
//    public void validateThatNewUserSignupTitleDisplayed()
//    {
//        driver.findElement(By.linkText("Signup / Login")).click();
//        Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'New User Signup!')]")).isDisplayed(), "New User Signup!");
//        System.out.println("-----------User IS In The SignUp/Login Page---------!");
//    }
//
//    @Test(dependsOnMethods = {"validateThatNewUserSignupTitleDisplayed"})
//    public void enterNameAndEmailInSignUpLoginPage()
//    {
//        driver.findElement(By.name("name")).sendKeys("Noureldinn");
//        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("Noureldinnn@outlook.com");
//        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
//        System.out.println("-----------User Entered Valid Data Successfully---------!");
//    }
//
//    @Test(dependsOnMethods = {"enterNameAndEmailInSignUpLoginPage"})
//    public void varifyThatEnterAccountInformationTitleDisplayed()
//    {
//        Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'Enter Account Information')]")).isDisplayed(),"The Message Is Not Displayed");
//        System.out.println("-----------User IS In The Enter Account Information Page---------!");
//    }
//
//    @Test(dependsOnMethods = {"varifyThatEnterAccountInformationTitleDisplayed"})
//    public void fiilingTheFormOfRegistration() {
//        // Choose Gender type and Enter password
//        driver.findElement(By.id("id_gender1")).click();
//        driver.findElement(By.id("password")).sendKeys("Nourazzam");
//
//        // Enter birthdate
//        new Select(driver.findElement(By.id("days"))).selectByValue("21");
//        new Select(driver.findElement(By.id("months"))).selectByIndex(9);
//        new Select(driver.findElement(By.id("years"))).selectByValue("1998");
//
//        // Click on checklists below birthdate
//        driver.findElement(By.id("newsletter")).click();
//        driver.findElement(By.id("optin")).click();
//
//        // Enter first and last name and company name and addresses
//        driver.findElement(By.id("first_name")).sendKeys("Noureldin");
//        driver.findElement(By.id("last_name")).sendKeys("Azzam");
//        driver.findElement(By.id("company")).sendKeys("GizaSystem");
//        driver.findElement(By.id("address1")).sendKeys("Cairo");
//        driver.findElement(By.id("address2")).sendKeys("Nasrcity");
//
//        // Select country and its information
//        WebElement country = driver.findElement(By.id("country"));
//        Select countrySelect = new Select(country);
//        countrySelect.selectByValue("Canada");
//        driver.findElement(By.id("state")).sendKeys("Manitoba");
//        driver.findElement(By.id("city")).sendKeys("Montreal");
//        driver.findElement(By.id("zipcode")).sendKeys("000000");
//
//        // Enter mobile number
//        driver.findElement(By.id("mobile_number")).sendKeys("01009266955");
//        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
//
//        // Registration Form is Filling Successfully
//        System.out.println("-----------The Registration Is Filled Successfully---------!");
//    }
//
//    @Test(dependsOnMethods = {"fiilingTheFormOfRegistration"})
//    public void varifyThatAccountIsCreated()
//    {
//        Assert.assertEquals(driver.findElement(By.xpath("//h2[@data-qa='account-created']")).getText(), "ACCOUNT CREATED!", "Message Is Not Displayed");
//        driver.findElement(By.linkText("Continue")).click();
//        System.out.println("-----------Registration Is Successfully Done---------!");
//    }
//
//    @Test(dependsOnMethods = {"varifyThatAccountIsCreated"})
//    public void varifyThatLoggedInAsusernameIsVisible()
//    {
//        Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'Noureldinn')]")).isDisplayed(),"Username Is Not Visible");
//    }
//
//    @Test(dependsOnMethods = {"varifyThatLoggedInAsusernameIsVisible"})
//    public void deleteAccount()
//    {
//        driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
//    }
//
//    @Test(dependsOnMethods = {"deleteAccount"})
//    public void verifyThatMessageAccountDeletedAfterClickOnDeleteAccount() {
//        System.out.println();Assert.assertEquals(driver.findElement(By.xpath("//h2[@data-qa='account-deleted']")).getText(),"ACCOUNT DELETED!", "Message Is Not Displayed");
//        driver.findElement(By.xpath("//a[@href='/']")).click();
//        System.out.println("-----------Account Deleted Successfully---------!");
//    }
//
//    @AfterClass
//    public void closingTheBrowser() {
//        driver.quitDriver();
//    }
//}















