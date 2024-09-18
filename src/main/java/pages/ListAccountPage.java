package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class ListAccountPage {

	WebDriver driver;
	String accountName = "susmita";

	@FindBy(how = How.XPATH , using = "//button[text()= 'Add Account']") WebElement ADD_ACCOUNT_BUTTON;
	@FindBy(how = How.XPATH, using ="//span[text()='List Accounts']") WebElement LIST_ACCOUNT_LINK;
	@FindBy(how = How.XPATH, using = "//td[text()='susmita']") WebElement VALIDATE_ACCOUNT_LIST;
	@FindBy(how = How.XPATH, using = "//input[@class='form-control input-sm']") WebElement SEARCH_BUTTON;
	
	

    // Constructor
    public ListAccountPage(WebDriver driver) {
        this.driver = driver;
    }   
	
    public void addAccountButton()
    {
    	ADD_ACCOUNT_BUTTON.click();
    }
    
    public void listAccountButton()
    {
    	
    	LIST_ACCOUNT_LINK.click();
    	
    }
    
    
    public void validateAccountCreated()
    {
    	Assert.assertEquals("Details not saved in List Account",accountName, VALIDATE_ACCOUNT_LIST.getText());
    }
    
}

