package bg.pragmatic.backend.tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bg.pragmatic.backend.pages.AdminCategoryPage;
import bg.pragmatic.backend.pages.AdminDashboard;
import bg.pragmatic.backend.pages.AdminLogin;
import bg.pragmatic.utils.Browser;

public class AdminCategoryList1Page {
	
	@Before
	public void startUp() {
		Browser.open();
		AdminLogin.goTo();
		
		
	}
	@After
	public void close() {
		Browser.quit();
	}
	
	@Test
	public void categoryList1PageTest() {
		AdminLogin.login("admin", "parola123!");
		AdminDashboard.clickOnCatalogMenu();
		AdminDashboard.clickOnCategorySection();
		AdminCategoryPage.verifyAdminCategoryListPage1();
		
	
	
	
	}
}
