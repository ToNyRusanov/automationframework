package bg.pragmatic.backend.tests;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;

import bg.pragmatic.backend.pages.AdminDashboard;
import bg.pragmatic.backend.pages.AdminLogin;
import bg.pragmatic.backend.pages.AdminOrdersPage;
import bg.pragmatic.utils.Browser;

public class AdimOrdersCheckBoxTest {

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
	public void ordersCheckBoxTest() {

		AdminLogin.login("admin", "parola123!");
		AdminDashboard.goToOrdersPage();
		AdminOrdersPage.verifyCheckBoxOrders();

	}
}
