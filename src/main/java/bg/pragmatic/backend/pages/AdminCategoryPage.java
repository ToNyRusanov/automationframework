package bg.pragmatic.backend.pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import bg.pragmatic.utils.Browser;

public class AdminCategoryPage {
	
	/**
	 *  This method check the admin category list from Main page(Dashboard) --> Catalog --> Category
	 * and get all the categories from page 1 and check if they match with the expected one.
	 * 
	 * 
	 */
	public static void verifyAdminCategoryListPage1 () {
		
	Wait<WebDriver> wait = new WebDriverWait(Browser.driver,10);
	WebElement categories = wait.until(new ExpectedCondition<WebElement>() {

		@Override
		public WebElement apply(WebDriver driver) {
			return driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']"));
		}
		
	});
	
	List<WebElement> categoryList = Browser.driver.findElements(By.xpath("//tbody//td[@class='text-left']"));
	List<String> actualCategoryElements = new ArrayList<>();
	for (WebElement categoryElement : categoryList) {
		actualCategoryElements.add(categoryElement.getText());
		
	}
	
	
	String [] expectedCategoryElements = {"Cameras","Components","Components  >  Mice and Trackballs",
			"Components  >  Monitors","Components  >  Monitors  >  test 1","Components  >  Monitors  >  test 2",
			"Components  >  Printers","Components  >  Scanners","Components  >  Web Cameras","Desktops",
			"Desktops  >  Mac","Desktops  >  PC","Laptops & Notebooks","Laptops & Notebooks  >  Macs","Laptops & Notebooks  >  Windows",
			"MP3 Players","MP3 Players  >  test 11","MP3 Players  >  test 12","MP3 Players  >  test 15","MP3 Players  >  test 16"};

	Assert.assertArrayEquals("The category list is not with equals names", expectedCategoryElements, actualCategoryElements.toArray());
}

}
