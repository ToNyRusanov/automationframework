package bg.pragmatic.frontend.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import bg.pragmatic.utils.Browser;

public class ShopBasePage {

	/**
	 * All the methods that start with verify are making asserts in the page and
	 * mark it as failed or it passes if it is as expected. THis method verifies the
	 * title of the current page if it is as you expected it.
	 * 
	 * @param messageOnFailure
	 *            the failing message that will appear in the reports if actual and
	 *            expected are not the same
	 * @param expectedTitle
	 *            the title that you would expect to be present in your browser
	 */
	public static void verifyTitle(String messageOnFailure, String expectedTitle) {
		String actualTitle = Browser.driver.getTitle();

		Assert.assertEquals(messageOnFailure, expectedTitle, actualTitle);
	}
	/**This method search an item in the shop from your input and click the search button.
	 * @param item - input the item you want to search.
	 */
	public static void searchItems (String item) {
		WebElement search = Browser.driver.findElement(By.className("input-lg"));
		search.click();
		search.sendKeys(item);
		WebElement searchButton = Browser.driver.findElement(By.className("btn-lg"));
		searchButton.click();
	}

	/**
	 * This methods verifies that there is items in the cart and check the sum of the cart.
	 * Verify the actual sum with the expected one.
	 * 
	 * @param failMessage
	 *            the message that will appear in the reports if actual and expected
	 *            results are not met.
	 * @param expectedCartSum
	 *            is the expected sum that you would expect after you add items to
	 *            the cart.
	 */
	public static void verifyCartSum(String failMessage, String expectedCartSum) {

		Wait<WebDriver> wait = new WebDriverWait(Browser.driver, 10);

		WebElement totalSum = wait.until(new ExpectedCondition<WebElement>() {

			@Override
			public WebElement apply(WebDriver sumTotal) {
				return sumTotal.findElement(By.id("cart-total"));

			}
		});
		String actualCartSum = totalSum.getText();

		Assert.assertEquals(failMessage, expectedCartSum, actualCartSum);

	}
	/**
	 * This method directly open the home page of our shop.
	 * The address is http://shop.pragmatic.bg
	 */

	public static void goToHomePage() {
		Browser.driver.findElement(By.linkText("Pragmatic Test Shop")).click();

	}
}
