package bg.pragmatic.frontend.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import bg.pragmatic.frontend.pages.ShopHomePage;
import bg.pragmatic.frontend.pages.MacbookPage;
import bg.pragmatic.frontend.pages.SearchResultPage;
import bg.pragmatic.frontend.pages.ShopBasePage;
import bg.pragmatic.utils.Browser;

public class AddItemToCartTest {
	
	
	@Before
	public void startUp() {
		Browser.open();
		ShopHomePage.goTo();
	}
	
	@After
	public void close() {
		Browser.quit();
	}
	
	@Test
	public  void addItemToCartTest() {

		ShopBasePage.searchItems("macbook");
		SearchResultPage.macbookResult();
		MacbookPage.addMacbookToCart();
		ShopHomePage.goToHomePage();
		ShopHomePage.verifyCartSum("The sum is not as expected", "1 item(s) - $602.00");
	
	}
	

}
