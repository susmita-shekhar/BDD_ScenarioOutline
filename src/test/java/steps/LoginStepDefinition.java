package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.AddAccountPage;
import pages.BasePage;
import pages.ListAccountPage;
import pages.LoginPage;

public class LoginStepDefinition extends BasePage{
	
	LoginPage loginPage;
	ListAccountPage listaccount;
	AddAccountPage addAccountPage;

	@Before
	public void openChrome()
	{
		init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		listaccount = PageFactory.initElements(driver, ListAccountPage.class);
		addAccountPage = PageFactory.initElements(driver, AddAccountPage.class);
	}
	
	
	@Given ("User is on the codefios login page")
	public void userIsOnLoginPage()
	{
		driver.get("https://codefios.com/ebilling/login");
	}
	
	@When ("User enters the {string} in the {string} field")
	public void userEntersUsernameAndPassword(String value,String field)
	{
		if(field.equalsIgnoreCase("username"))
		{
			loginPage.enterUserName(value);
		}else if(field.equalsIgnoreCase("password"))
		{
			loginPage.enterPassWord(value);
		}else
		{
			System.out.println("Enter valid data");
		}
	}
	
	@And ("User clicks on {string}")
	public void clicksOnButton(String buttonName) throws InterruptedException
	{
		switch(buttonName) {
		case "login": 
			
			loginPage.clicksOnSignInButton();
			Thread.sleep(5000);
			break;
		case "listAccounts":
			listaccount.listAccountButton();
			break;
		case "addAccount":
			listaccount.addAccountButton();
			Thread.sleep(2000);
			break;
		case "Save":
			addAccountPage.clickOnSave();
			Thread.sleep(2000);
			break;
		}
		
	}
	
	@Then ("User should land on Dashboard page")
	public void dashboardvalidation()
	{
		loginPage.validationOfDashboard();;
	}
}

