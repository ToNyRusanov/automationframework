package bg.pragmatic.frontend.pages;

import bg.pragmatic.utils.Browser;

public class ShopHomePage extends ShopBasePage{
	
	/**
	 * This method open the shop home page on http://shop.pragmatic.bg
	 */
	public static void goTo() {
		Browser.driver.get("http://shop.pragmatic.bg");
	}
	

}
