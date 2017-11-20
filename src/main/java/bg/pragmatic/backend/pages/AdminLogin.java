package bg.pragmatic.backend.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import bg.pragmatic.core.pages.BasePage;
import bg.pragmatic.utils.Browser;



public class AdminLogin extends BasePage {

	/**
	 * When using this method it opens the admin login page of our
	 * project i.e. shop.pragmatic.bg/admin
	 */
	public static void goTo() {
		Browser.driver.get("http://shop.pragmatic.bg/admin");
	}

	/**
	 * Use this method when you would like to login in the admin area.
	 * 
	 * @author Strahinski
	 * @param username the username you would like to login with
	 * @param password the password you would like to login with
	 */
	public static void login(String username, String password) {
		Browser.driver.findElement(By.id("input-username")).sendKeys(username);
		Browser.driver.findElement(By.id("input-password")).sendKeys(password);
		Browser.driver.findElement(By.cssSelector(".btn-primary")).click();
	}

	/**
	 * Use this method to verify the validation message that appears on the
	 * admin login page
	 * @param messageOnFailure the message that will appear in the report in case of failure
	 * @param expectedValidationMessage the expected validation message 
	 */
	public static void verifyValidationMessage(String messageOnFailure, String expectedValidationMessage) {
		WebElement validationElement = Browser.driver.findElement(By.cssSelector(".alert-danger"));
		String actualValidationMessage = validationElement.getText();
		
		Assert.assertTrue(messageOnFailure, actualValidationMessage.contains(expectedValidationMessage));
//		Assert.assertEquals(messageOnFailure, expectedValidationMessage, actualValidationMessage);
	}

}
