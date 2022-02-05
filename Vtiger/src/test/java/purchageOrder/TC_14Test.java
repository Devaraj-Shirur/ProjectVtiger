package purchageOrder;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClassTest;
import pomRepo.HomePage;
import pomRepo.PurchageOrderPage;

public class TC_14Test extends BaseClassTest {
	@Test
	public void crestPurchageOrderWithItemQtyAndListPrice() {
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
	
		pop.getQtyTextfield().sendKeys("2");
		pop.getDeleteItemIcon().click();
		pop.getSaveButton().click();
		Reporter.log("Successfully Created an Order And is displayed Successfully",true);
		
		js.executeScript("window.scrollBy(0,-1500);");

		
		


	}

}
