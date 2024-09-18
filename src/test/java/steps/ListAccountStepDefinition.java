package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.AddAccountPage;
import pages.BasePage;
import pages.ListAccountPage;

public class ListAccountStepDefinition extends BasePage{
	
	AddAccountPage addAccountPage = PageFactory.initElements(driver, AddAccountPage.class);
	ListAccountPage listAccountPage;
	String accountName = null;

	@And ("User enters {string} in the {string} field in accounts page") 
	public void userEntersDetails(String value, String field) throws InterruptedException
{
		Thread.sleep(2000);
	switch (field) {
	case "accountName":
		addAccountPage.enterAccountName(value);
		accountName = value;
		break;
	case "description":
		addAccountPage.enterDescription(value);
		break;
	case "initialBalance":
		addAccountPage.enterInitialBalance(value);
		break;
	case "accountNumber":
		addAccountPage.enterAccountNumber(value);
		break;
	case "contactPerson":
		addAccountPage.enterContactPerson(value);
		break;
		
	}	


}
	
	@Then ("User should be able to validate account created successfully")
	public void validateAccount()
	{
		
		listAccountPage= PageFactory.initElements(driver, ListAccountPage.class);
		listAccountPage.validateAccountCreated();
	}
	
	
	
	
	
}
