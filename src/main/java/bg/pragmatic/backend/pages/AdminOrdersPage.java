package bg.pragmatic.backend.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import bg.pragmatic.utils.Browser;

public class AdminOrdersPage {
	/**
	 * This method click on main orders check box and verify that after the click, the check box is selected. 
	 */
	public static void verifyCheckBoxOrders () {
		
		Wait<WebDriver> wait = new WebDriverWait(Browser.driver , 10);
		WebElement checkBox = wait.until(new ExpectedCondition<WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@type='checkbox']"));
			}
		});
		if (!checkBox.isSelected()) {
			checkBox.click();
		}
		
		Assert.assertTrue("The checkbox is not selected", checkBox.isSelected());
		
	}
	}


