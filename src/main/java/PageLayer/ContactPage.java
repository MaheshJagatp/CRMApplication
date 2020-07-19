package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.Base;
import ObjectRepository.Configuration;

public class ContactPage extends Base {

	public ContactPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = Configuration.contactPageClick)
	WebElement contactPageClick;
	
	@FindBy(xpath=Configuration.contactNewBtn)
	WebElement contactnewbtn;
	
	@FindBy(xpath=Configuration.contactFirstNameInput)
	WebElement contactfirstnameinput;
	
	
	public void ContactClick() {
		wait.until(ExpectedConditions.elementToBeClickable(contactPageClick)).click();
		
	}
	
	public void newBtnClick() {
		
		//wait.until(ExpectedConditions.elementToBeClickable(contactnewbtn)).click();
		contactnewbtn.click();
	}
	
	public void fillContactInformationForm(String firstname) {
		wait.until(ExpectedConditions.elementToBeClickable(contactfirstnameinput)).sendKeys(firstname);
	}
	
	
	
	

}
