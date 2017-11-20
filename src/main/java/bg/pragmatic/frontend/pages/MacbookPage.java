package bg.pragmatic.frontend.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import bg.pragmatic.utils.Browser;

public class MacbookPage {
	/**
	 *  This method add Macbook item to the cart.
	 * 
	 */
	public static void addMacbookToCart () {
		
		Wait<WebDriver> wait = new WebDriverWait(Browser.driver, 10);
		WebElement addCartButton = wait.until(new ExpectedCondition<WebElement>(){
			

			@Override
			public WebElement apply(WebDriver button) {
				return button.findElement(By.id("button-cart"));
			}
		});
		addCartButton.click();
	}

}
