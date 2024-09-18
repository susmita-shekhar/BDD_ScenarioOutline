package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage()
	{
		this.driver = driver;
	}
	
	
	@FindBy(how = How.ID, using = "user_name") WebElement USER_NAME;
	@FindBy(how = How.ID, using = "password") WebElement PASSWORD;
	@FindBy(how = How.ID, using = "login_submit") WebElement SIGN_IN;
	@FindBy(how = How.XPATH, using = "//strong[text()='Dashboard']") WebElement Dashboard;
	
	
	public void enterUserName(String username)
	{
		USER_NAME.sendKeys(username);
	}
	
	
	public void enterPassWord(String password)
	{
		PASSWORD.sendKeys(password);
	}
	
	public void clicksOnSignInButton()
	{
		SIGN_IN.click();
	}
	public void clicksOnSave()
	{
		SIGN_IN.click();
	}
	
	public void validationOfDashboard()
	{
		Assert.assertEquals("Dashboard does not match", "Dashboard",Dashboard.getText());
	}
}
