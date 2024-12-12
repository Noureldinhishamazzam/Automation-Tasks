package Headway;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//public class demoProject {
//
//    public static void main(String[] args) {
//        //Open browser and website
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.navigate().to("https://automationexercise.com/");
//        driver.findElement(By.linkText("Signup / Login")).click();
//
//        //Click on signup/login link and enter Name and Email
//        driver.findElement(By.name("name")).sendKeys("Noureldinn");
//        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("Noureldinn@outlook.com");
//        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
//
//        //Choose Gender type and Enter password
//        driver.findElement(By.id("id_gender1")).click();
//        driver.findElement(By.id("password")).sendKeys("Nourazzam");
//
////        WebElement days = driver.findElement(By.id("days"));
////        Select daysSelect = new Select(days);
////        daysSelect.selectByValue("21");
//
////        WebElement months = driver.findElement(By.id("months"));
////        Select monthSelect = new Select(months);
////        monthSelect.selectByIndex(9);
//
//        //        WebElement year = driver.findElement(By.id("years"));
////        Select yearSelect = new Select(year);
////        yearSelect.selectByValue("1998");
//
//        //Enter birthdate
//        new Select(driver.findElement(By.id("days"))).selectByValue("21");
//        new Select(driver.findElement(By.id("months"))).selectByIndex(9);
//        new Select(driver.findElement(By.id("years"))).selectByValue("1998");
//
//        //Clcik on checklists below birthdate
//        driver.findElement(By.id("newsletter")).click();
//        driver.findElement(By.id("optin")).click();
//
//        //Enter first and last name and company name and addresses
//        driver.findElement(By.id("first_name")).sendKeys("Noureldin");
//        driver.findElement(By.id("last_name")).sendKeys("Azzam");
//        driver.findElement(By.id("company")).sendKeys("GizaSystem");
//        driver.findElement(By.id("address1")).sendKeys("Cairo");
//        driver.findElement(By.id("address1")).sendKeys("Nasrcity");
//
//        //Select country and it's information
//        WebElement country = driver.findElement(By.id("country"));
//        Select countrySelect = new Select(country);
//        countrySelect.selectByValue("Canada");
//        driver.findElement(By.id("state")).sendKeys("Manitoba");
//        driver.findElement(By.id("city")).sendKeys("Montreal");
//        driver.findElement(By.id("zipcode")).sendKeys("000000");
//
//        //Enter mobile number
//        driver.findElement(By.id("mobile_number")).sendKeys("01009266955");
//        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
//
//        //Display Message that the account is created
//       System.out.println(driver.findElement(By.xpath("//h2[@data-qa='account-created']")).getText());
//
//       //Click on continue to redirect to home page
//       driver.findElement(By.linkText("Continue")).click();
//
//       /*driver.findElement(By.linkText("Delete Account")).click();
//       System.out.println(driver.findElement(By.xpath("//h2[@data-qa='account-deleted']")).getText());
//       driver.findElement(By.linkText("Continue")).click();*/
//
//        //Click on delete account link then message is displayed that the account is deleted
//        // then click on continue button
//        driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
//        System.out.println(driver.findElement(By.xpath("//h2[@data-qa='account-deleted']")).getText());
//        driver.findElement(By.xpath("//a[@href='/']")).click();
//
//        //Close browser
//        driver.quit();
//    }
//}
