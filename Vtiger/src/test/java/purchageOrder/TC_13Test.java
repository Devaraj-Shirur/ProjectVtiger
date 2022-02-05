package purchageOrder;

import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClassTest;
import pomRepo.HomePage;
import pomRepo.PurchageOrderPage;

public class TC_13Test extends BaseClassTest {
	@Test
	public void creatPurchageOrderWithoutEnteringListPrice() {
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
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500);");
		
		pop.getAddServiceButton().click();
		pop.getAddServiceIcon().click();
		
		String parentWindowId1 = driver.getWindowHandle();
		Set<String> allWindowId1 = driver.getWindowHandles();
		allWindowId1.remove(parentWindowId1);
		
		for(String windowID : allWindowId1) {
			driver.switchTo().window(windowID);
		}
		
		pop.getSelectServiceCheckBox().click();
		pop.getSelectServiveButton().click();
		
		driver.switchTo().window(parentWindowId1);
		pop.getMoveDownardArrowButton().click();
		pop.getListPriceTextfield().clear();
		
		pop.getQtyTextfield().sendKeys("2");
		pop.getSaveButton().click();
		
		Alert AlertPopUp = driver.switchTo().alert();
		String actualAlerMessage = AlertPopUp.getText();
		String expectedAlertMessage = "List Price cannot be empty";
		if(actualAlerMessage.equalsIgnoreCase(expectedAlertMessage)) {
			System.out.println("Alert Message Is Displayed Successfully");
		}else {
			System.out.println("Alert Message is Not Displayed Correctly");
		}
//		assertEquals(actualAlerMessage, expectedAlertMessage, "alert message displayed successfully");
		AlertPopUp.accept();
		

	}

	private void If(boolean equalsIgnoreCase) {
		// TODO Auto-generated method stub
		
	}

}
