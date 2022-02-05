package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import genericLib.BaseClassTest;

public class HomePage extends BaseClassTest{
	
	public HomePage(WebDriver action) {
		PageFactory.initElements(action, this);
	}
	
	@FindBy(name="query_string")
	private WebElement searchTextfieldOfHP;
	
	@FindBy(xpath="//input[@class='searchBtn']")
	private WebElement searchButtonOfHP;
	
	@FindBy(linkText="Calendar")
	private WebElement calendarButton;
	
	@FindBy(linkText="More")
	private WebElement moreButtonOfHP;
	
	@FindBy(name="Purchase Order")
	private WebElement purchageOrderLink;
	
//	@FindBy(xpath="//img[@src=\'themes/softed/images/user.PNG\']")
//	private WebElement accountButton;
	
//	@FindBy(linkText="Sign Out")
//	private WebElement signoutButton;
//
//	public WebElement getSearchTextfieldOfHP() {
//		return searchTextfieldOfHP;
//	}

//	public WebElement getAccountButton() {
//		return accountButton;
//	}
//
//	public WebElement getSignoutButton() {
//		return signoutButton;
//	}

	public WebElement getSearchButtonOfHP() {
		return searchButtonOfHP;
	}

	public WebElement getCalendarButton() {
		return calendarButton;
	}

	public WebElement getMoreButtonOfHP() {
		return moreButtonOfHP;
	}

	public WebElement getPurchageOrderLink() {
		return purchageOrderLink;
	}
	

	
}
