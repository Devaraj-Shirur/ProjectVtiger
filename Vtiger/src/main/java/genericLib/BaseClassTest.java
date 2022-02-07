package genericLib;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomRepo.HomePage;
import pomRepo.LoginPage;

/***
 * 
 * @author Devaraj
 *
 */
public class BaseClassTest extends Constants   {
	
	public static WebDriver driver;
	public LoginPage loginPage;
	public HomePage homePage;
	
	
	@BeforeClass
	public void launchTheApplication() {
		

		System.setProperty(CHROMEKEY, CHROMEPATH);
		driver = new ChromeDriver();
		Reporter.log("Browser launched Successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser Maximized Successfully", true);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		loginPage = new LoginPage(driver);
		

		// Step1 Launch The Application
		driver.get(VtURL);
//		String expectedTitleOfLoginPage = "vtiger CRM 5 - Commercial Open Source CRM";
//		assertEquals(expectedTitleOfLoginPage, driver.getTitle(), "Login Page is not Displayed Correctly");
		Reporter.log("Login Page Displayed Successfully", true);

	}

	// Step2 Login To The Application With Valid Credentials
	@BeforeMethod
	public void loginToTheApplication() {
		loginPage.loginToApp(USERNAME, PASSWORD);
//		String extectedHomePageTitle = " Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
//		assertEquals(extectedHomePageTitle, driver.getTitle(), "Home Page is not Displayed Successfully");
		Reporter.log("Home Page is Displayed Successfully");

	}

	// Step3 LogOut Of The Application
	@AfterMethod
	public void logoutOfTheApplication() {
		WebElement accountButton = driver.findElement(
		By.xpath("//img[@title='vtiger-crm-logo.gif']/../..//img[@src='themes/softed/images/user.PNG']"));
		WebElement signoutButton = driver.findElement(By.xpath("//a[@class='drop_down_usersettings']"));

		Actions action = new Actions(driver);
		action.moveToElement(accountButton).perform();
		action.moveToElement(signoutButton).click().perform();

		Reporter.log("Logedout Successfully", true);

	}

	// Step4 Close the application
	@AfterClass
	public void closeTheApp() {
		driver.quit();
	}

}
