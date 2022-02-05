package purchageOrder;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import genericLib.BaseClassTest;
import pomRepo.HomePage;
import pomRepo.PurchageOrderPage;

public class TC_15Test extends BaseClassTest {
	@Test
	public void creatPurchageOrderWithAllManditoryFieldsxceptItems() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage homepage=new HomePage(driver);
		homepage.getMoreButtonOfHP().click();
		homepage.getPurchageOrderLink().click();
		String actuslPurchageOrderTitle = driver.getTitle();
		String expectedPurchageTitle = " Administrator - Purchase Order - vtiger CRM 5 - Commercial Open Source CRM";
		if(expectedPurchageTitle.equalsIgnoreCase(actuslPurchageOrderTitle)) {
			System.out.println("Purchage Order Title is Displayed Successfully");
		}else {
			System.out.println("Purchage Order Title is Not displayed correctly");
		}
//		assertEquals(expectedPurchageTitle, driver.getTitle(), "Prchage Order Page Is not Displayed");

		
		PurchageOrderPage pop = new PurchageOrderPage(driver);
		pop.getCreatPurchageOrderButton().click();
		pop.getSubjectNameTestfield().sendKeys("Lucifer");
		pop.getAddVendorButton().click();
		
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentWindowId);
		for(String window : allWindowId) {
			driver.switchTo().window(window);
		}
		pop.getLaptopVendorProfile().click();
		driver.switchTo().window(parentWindowId);
	
		
		pop.getBillingStreetAddress().sendKeys("Banglore");
		pop.getShippingStreetAddress().sendKeys("Banglore");
		
		
		pop.getSaveButton().click();
		
		Alert alertPopUp = driver.switchTo().alert();
		String actualAlertMessage = alertPopUp.getText();
		String expectedAlertMessage = "Manditory fields cannot be empty";
		if(actualAlertMessage.equals(expectedAlertMessage)) {
			System.out.println("Alet message is Displayed Successfully");
		}else {
			System.out.println("Alert message is  not displayed successfully, Insted it Displays : "+actualAlertMessage);
		}
		alertPopUp.accept();

	}

}
