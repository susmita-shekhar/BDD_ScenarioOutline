package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

	public static WebDriver driver;
	
	public static void init()
	{
		System.setProperty("webdriver.chrome.driver", "src\\main\\driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
	}
	
	public static void tearDown()
	{
		driver.close();
		driver.quit();
	}
}
