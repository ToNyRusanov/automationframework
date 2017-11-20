package bg.pragmatic.backend.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bg.pragmatic.backend.pages.AdminDashboard;
import bg.pragmatic.backend.pages.AdminLogin;
import bg.pragmatic.utils.Browser;

public class AdminLoginTest {
	
	@Before
	public void setup() {
		Browser.open();
	}
	
	@Test
	public void successfulLogin() {
		AdminLogin.goTo();
		AdminLogin.login("admin", "parola123!");
		AdminDashboard.verifyTitle("We were unable to "
				+ "login successfully, because the title was not as expected", "Dashboard");
				
	}
	
	@Test
	public void unsuccessfulLogin() {
		AdminLogin.goTo();
		AdminLogin.login("asdfasdf", "dsfsadf");
		AdminLogin.verifyValidationMessage("The expected validation message was not displayed.", "No match for Username "
				+ "and/or Password.");
	}
	
	@After
	public void tearDown() {
		Browser.quit();
	}

}
