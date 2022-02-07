package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import genericLib.BaseClassTest;

/***
 * 
 * @author Devaraj
 *
 */
public class LoginPage extends BaseClassTest {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
	private WebElement userNameTextfield; 
	
	@FindBy(name="user_password")
	private WebElement passwordTextfield; 
	
	@FindBy(id="submitButton")
	private WebElement loginButton;

	public WebElement getUserNameTextfield() {
		return userNameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	} 
	
	public void loginToApp(String username,String password) {
		getUserNameTextfield().clear();
		getUserNameTextfield().sendKeys(username);
		Reporter.log("Username is entered successfully",true);
		getPasswordTextfield().clear();
		getPasswordTextfield().sendKeys(password);
		Reporter.log("Password is entered successfully",true);
		getLoginButton().click();
	}

}
