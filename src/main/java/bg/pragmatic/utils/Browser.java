package bg.pragmatic.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver driver;
	
	public static void open() {
		System.setProperty("webdriver.chrome.driver", "D:\\Pragmatic\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void quit() {
		driver.quit();
	}

}
