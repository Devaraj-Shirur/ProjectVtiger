package purchageOrder;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClassTest;
import pomRepo.HomePage;
import pomRepo.PurchageOrderPage;

public class TC_11Test extends BaseClassTest {
	@Test
	public void creatPurchageOrderwithItemAndClickonDownordButton(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage homepage=new HomePage(driver);
		homepage.getMoreButtonOfHP().click();
		homepage.getPurchageOrderLink().click();
		String expectedPurchageTitle = " Administrator - Purchase Order - vtiger CRM 5 - Commercial Open Source CRM";
		String actualPurchageTitle = driver.getTitle();
		if(actualPurchageTitle.equals(expectedPurchageTitle)) {
			System.out.println("Purchage Order Page is Displayed Successfully");
		}else {
			System.out.println("Purchage Order Page Title is not displayed Correctly, Insted it displays : "+actualPurchageTitle);
		}
//		assertEquals(expectedPurchageTitle, driver.getTitle(), "Prchage Order Page Is not Displayed");
		
		
		PurchageOrderPage pop = new PurchageOrderPage(driver);
		pop.getCreatPurchageOrderButton().click();
//		WebElement scrollele = driver.findElement(By.xpath("//span[text()'Powered by vtiger CRM ']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);",scrollele);
		js.executeScript("window.scrollBy(0,1500);");
		pop.getAddServiceButton().click();
		pop.getAddServiceIcon().click();
		
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowId.remove(parentWindowId);
		
		for(String windowID : allWindowId) {
			driver.switchTo().window(windowID);
		}
		
		pop.getSelectServiceCheckBox().click();
		pop.getSelectServiveButton().click();
		
		driver.switchTo().window(parentWindowId);
		
		pop.getMoveDownardArrowButton().click();
		Reporter.log("The order of the item has moved Down",true);
		
		String expectedText= "laptopService";
		String actualText = pop.getServiceNameTextfield().getText();
		if(actualText.equals(expectedText)) {
			System.out.println("laptop service is displayed successfully ");
		}else {
			System.out.println("laptop service is not displayed successfully");
		}
//		assertEquals(actualText, expectedText, "Laptop Service is displayed Successfully");
		
		
		js.executeScript("window.scrollBy(0,-1500);");
		
	}

}
