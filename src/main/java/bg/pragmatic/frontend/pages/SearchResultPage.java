package bg.pragmatic.frontend.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import bg.pragmatic.utils.Browser;

public class SearchResultPage {
	/**
	 *  This method check the search result page for item "Macbook" and open the item page.
	 * 
	 */
	public static void macbookResult() {
		Wait<WebDriver> wait = new WebDriverWait(Browser.driver, 10);

		WebElement macBookSelect = wait.until(new ExpectedCondition<WebElement>() {

			@Override
			public WebElement apply(WebDriver find) {
				return find.findElement(By.linkText("MacBook"));

			}
		});
		macBookSelect.click();
	}

}
