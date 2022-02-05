package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLib.BaseClassTest;

public class PurchageOrderPage extends BaseClassTest {
	
	public PurchageOrderPage(WebDriver action) {
		PageFactory.initElements(action, this);
	}
	
	@FindBy(xpath="//img[@title='Create Purchase Order...']")
	private WebElement creatPurchageOrderButton;
	
	@FindBy(name="subject")
	private WebElement subjectNameTestfield;
	
	@FindBy(xpath="//td[text()='Vendor Name 			']/..//img[@title='Select']")
	private WebElement addVendorButton;
	
	@FindBy(linkText="laptop")
	private WebElement laptopVendorProfile;
	
	@FindBy(name="bill_street")
	private WebElement billingStreetAddress;
	
	@FindBy(name="ship_street")
	private WebElement shippingStreetAddress;
	
	@FindBy(xpath="//input[@value='Add Service']")
	private WebElement addServiceButton;
	
	@FindBy(id="searchIcon2")
	private WebElement addServiceIcon;
	
	@FindBy(name="selected_id")
	private WebElement selectServiceCheckBox;
	
	@FindBy(xpath="//input[@value='Select Services']")
	private WebElement selectServiveButton;
	
	@FindBy(id="productName1")
	private WebElement serviceNameTextfield;
	
	@FindBy(xpath="//a[@title='Move Downward']")
	private WebElement moveDownardArrowButton;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveButton;
	
	@FindBy(id="listPrice1")
	private WebElement listPriceTextfield;
	
	@FindBy(id="qty1")
	private WebElement qtyTextfield;
	
	@FindBy(xpath = "//img[@title='Products']")
	private WebElement searchProductIcon;
	
	@FindBy(xpath = "//img[@src='themes/images/delete.gif']")
	private WebElement deleteItemIcon;
	
	public WebElement getDeleteItemIcon() {
		return deleteItemIcon;
	}

	public WebElement getSearchProductIcon() {
		return searchProductIcon;
	}

	public WebElement getQtyTextfield() {
		return qtyTextfield;
	}

	public WebElement getListPriceTextfield() {
		return listPriceTextfield;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSubjectNameTestfield() {
		return subjectNameTestfield;
	}

	public WebElement getAddVendorButton() {
		return addVendorButton;
	}

	public WebElement getLaptopVendorProfile() {
		return laptopVendorProfile;
	}

	public WebElement getBillingStreetAddress() {
		return billingStreetAddress;
	}

	public WebElement getShippingStreetAddress() {
		return shippingStreetAddress;
	}

	public WebElement getCreatPurchageOrderButton() {
		return creatPurchageOrderButton;
	}

	public WebElement getAddServiceButton() {
		return addServiceButton;
	}

	public WebElement getAddServiceIcon() {
		return addServiceIcon;
	}

	public WebElement getSelectServiceCheckBox() {
		return selectServiceCheckBox;
	}

	public WebElement getSelectServiveButton() {
		return selectServiveButton;
	}

	public WebElement getServiceNameTextfield() {
		return serviceNameTextfield;
	}

	public WebElement getMoveDownardArrowButton() {
		return moveDownardArrowButton;
	}
	
	
	

}
