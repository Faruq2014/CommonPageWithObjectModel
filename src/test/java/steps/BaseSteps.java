package steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author mofmo
 *This page is to design browser configuration and
 *only chrome browser is designed.
 *Before method will run before every test class 
 *After method will close after every test class
 */
public class BaseSteps {
	private WebDriver driver;

	@Before(order = 0)
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("before hook ");
	}

	@After(order = 1)
	public void tearDown() {
		driver.quit();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("after hook");
	}

	public WebDriver getDriver() {
		return driver;

	}
}
