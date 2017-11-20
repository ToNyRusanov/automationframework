package bg.pragmatic.backend.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import bg.pragmatic.core.pages.BasePage;
import bg.pragmatic.utils.Browser;

public class AdminDashboard extends BasePage {
	/**
	 * This method click on catalog menu in left the section.
	 */
	public static void clickOnCatalogMenu () {
		WebElement catalog = Browser.driver.findElement(By.xpath("//li[@id='menu-catalog']/a"));
		catalog.click();
	}
	/**
	 * This method click on category section if the catalog menu is opened. And open the Admin category page.
	 */
	public static void clickOnCategorySection () {
		WebElement category = Browser.driver.findElement(By.xpath("//ul[@id='collapse1']/li/a"));
		category.click();
	}
	/**
	 * This method open the Orders page.
	 */
	public static void goToOrdersPage () {
		WebElement linkToOrders = Browser.driver.findElement(By.xpath("//div[@class='tile-footer']/a"));
		linkToOrders.click();
		
	}

}
