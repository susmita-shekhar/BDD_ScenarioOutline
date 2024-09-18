package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddAccountPage {

WebDriver driver;
	
	@FindBy(how = How.ID , using = "account_name") WebElement accountNameField;

    @FindBy(how = How.ID , using = "description") WebElement descriptionField;

    @FindBy(how = How.ID, using = "balance") WebElement initialBalanceField;

    @FindBy(how = How.ID,using = "account_number") WebElement accountNumberField;

    @FindBy(how = How.ID,using  = "contact_person") WebElement contactPersonField;
    
    @FindBy(how = How.ID,using  = "accountSave") WebElement account_save;

    // Constructor
    public AddAccountPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void enterAccountName(String accountName)
    {
    	accountNameField.sendKeys(accountName);
    }
    
    public void enterDescription(String description)
    {
    	descriptionField.sendKeys(description);
    }
    
    public void enterInitialBalance(String initialBalance)
    {
    	initialBalanceField.sendKeys(initialBalance);
    }
    
    public void enterAccountNumber(String accountNumber)
    {
    	accountNumberField.sendKeys(accountNumber);
    }
    
    public void enterContactPerson(String contactPerson)
    {
    	contactPersonField.sendKeys(contactPerson);
    }
    
    public void clickOnSave()
    {
    	account_save.click();
    }
}


